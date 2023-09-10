package Arthur_Openheimer_225;

public class Academia {
    
    String nome;
    String numTelefone;
    Equipamento [] equipamentos = new Equipamento[40];

    void mostrarInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + numTelefone);
        System.out.println("Equipamentos: ");
        for (int i = 0; i < equipamentos.length; i++) {
            if(equipamentos[i] != null){
                equipamentos[i].mostrarInfos();
            }
        }
    }

    void cadastrarEquipamento(Equipamento e){
        for (int i = 0; i < equipamentos.length; i++) {
            if (equipamentos[i] == null) {
                equipamentos[i] = e;
                break;
            }
        }
    }

    void infosEquipamentoManutencao(){
        int qtdManutencao = 0;
        int numEquipamentos = 0;

        if(equipamentos[0] != null && equipamentos[1] != null){
            for (int i = 0; i < equipamentos.length; i++) {
                if (equipamentos[i] != null) {
                    numEquipamentos++;
                    if (equipamentos[i].status.equalsIgnoreCase("Manutencao")) {
                        qtdManutencao++;
                    }
                }
            }

            System.out.println("Quantidade de equipamentos em manutencao: " + qtdManutencao);
            System.out.println("Porcentagem de equipamentos em manutencao: " + (qtdManutencao * 100) /numEquipamentos + "%");
        } else {
            System.out.println("É necessário ter pelo menos 2 equipamentos cadastrados");
        }
    }

    void mostrarMaisCaroMaisBarato(){
        Equipamento maisCaro = null;
        Equipamento maisBarato = null;

        if(equipamentos[0] != null && equipamentos[1] != null){
            for (int i = 0; i < equipamentos.length; i++) {
                if (equipamentos[i] != null) {
                    if (maisCaro == null) {
                        maisCaro = equipamentos[i];
                    } else if (equipamentos[i].valorAquisicao > maisCaro.valorAquisicao) {
                        maisCaro = equipamentos[i];
                    }

                    if (maisBarato == null) {
                        maisBarato = equipamentos[i];
                    } else if (equipamentos[i].valorAquisicao < maisBarato.valorAquisicao) {
                        maisBarato = equipamentos[i];
                    }
                }
            }

            System.out.println("Equipamento mais caro: ");
            maisCaro.mostrarInfos();
            System.out.println("Equipamento mais barato: ");
            maisBarato.mostrarInfos();
        } else {
            System.out.println("É necessário ter pelo menos 2 equipamentos cadastrados");
        }
    }
}
