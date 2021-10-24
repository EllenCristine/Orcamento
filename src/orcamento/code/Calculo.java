package orcamento.code;

public class Calculo {

    public double calculoITBI(double valorAvaliacao) {

        return valorAvaliacao * 0.02;
    }

    public double calculoEscritura(double valorAvaliacao) {
        double valor = 0;

        //Até 5.000
        if (valorAvaliacao > 0 && valorAvaliacao <= 5000) {
            valor = 180;
        }

        //De 5.000,01 à 10.000
        if (valorAvaliacao > 5000.01 && valorAvaliacao <= 10000) {
            valor = 400;
        }

        //De 10.000,01 à 15.000
        if (valorAvaliacao > 10000.01 && valorAvaliacao <= 15000) {
            valor = 600;
        }

        //De 15.000,01 à 20.000,00
        if (valorAvaliacao > 15000.01 && valorAvaliacao <= 20000) {
            valor = 800;
        }

        //De 20.000,01 à 25.000,00
        if (valorAvaliacao > 20000.01 && valorAvaliacao <= 25000) {
            valor = 1000;
        }

        //De 25.000,01 à 30.000
        if (valorAvaliacao > 25000 && valorAvaliacao <= 30000) {
            valor = 1200;
        }

        //De 30.000,01 à 35.000
        if (valorAvaliacao > 30000 && valorAvaliacao <= 35000) {
            valor = 1400;
        }

        //De 35.000,01 à 40.000
        if (valorAvaliacao > 35000 && valorAvaliacao <= 40000) {
            valor = 1500;
        }

        //De 40.000,01 à 45.000
        if (valorAvaliacao > 40000 && valorAvaliacao <= 45000) {
            valor = 1600;
        }

        //De 45.000,01 à 50.000
        if (valorAvaliacao > 45000 && valorAvaliacao <= 50000) {
            valor = 1700;
        }

        //De 50.000,01 à 60.000
        if (valorAvaliacao > 50000 && valorAvaliacao <= 60000) {
            valor = 1800;
        }

        //De 60.000,01 à 70.000
        if (valorAvaliacao > 60000 && valorAvaliacao <= 70000) {
            valor = 2100;
        }

        //De 70.000,01 à 80.000
        if (valorAvaliacao > 70000 && valorAvaliacao <= 80000) {
            valor = 2400;
        }

        //De 80.000,01 à 90.000
        if (valorAvaliacao > 80000 && valorAvaliacao <= 90000) {
            valor = 2600;
        }

        //De 90.000,01 à 100.000
        if (valorAvaliacao > 90000 && valorAvaliacao <= 100000) {
            valor = 2900;
        }

        //De 100.000,01 à 150.000
        if (valorAvaliacao > 100000 && valorAvaliacao <= 150000) {
            valor = 3700;
        }

        //De 150.000,01 à 200.000
        if (valorAvaliacao > 150000 && valorAvaliacao <= 200000) {
            valor = 4900;
        }

        //De 200.000,01 à 250.000
        if (valorAvaliacao > 200000 && valorAvaliacao <= 250000) {
            valor = 5400;
        }

        //De 250.000,01 à 300.000
        if (valorAvaliacao > 250000 && valorAvaliacao <= 300000) {
            valor = 6500;
        }
        //Acima de 300.000
        if (valorAvaliacao > 300000) {
            valor = 7000;
        }
        return valor;
    }

    public double calculoRegistro(double valorAvaliacao) {
        double valor = 0;
        
        //Até 5.000
        if (valorAvaliacao > 0 && valorAvaliacao <= 5000) {
            valor = 97.20;
        }

        //De 5.000,01 à 10.000
        if (valorAvaliacao > 5000 && valorAvaliacao <= 10000) {
            valor = 195.75;
        }

        //De 10.000,01 à 15.000
        if (valorAvaliacao > 10000 && valorAvaliacao <= 15000) {
            valor = 292.95;
        }

        //De 15.000,01 à 20.000,00
        if (valorAvaliacao > 15000 && valorAvaliacao <= 20000) {
            valor = 391.50;
        }

        //De 20.000,01 à 25.000,00
        if (valorAvaliacao > 20000.01 && valorAvaliacao <= 25000) {
            valor = 487.35;
        }

        //De 25.000,01 à 30.000
        if (valorAvaliacao > 25000 && valorAvaliacao <= 30000) {
            valor = 584.55;
        }

        //De 30.000,01 à 35.000
        if (valorAvaliacao > 30000 && valorAvaliacao <= 35000) {
            valor = 683.10;
        }

        //De 35.000,01 à 40.000
        if (valorAvaliacao > 35000 && valorAvaliacao <= 40000) {
            valor = 780.30;
        }

        //De 40.000,01 à 45.000
        if (valorAvaliacao > 40000 && valorAvaliacao <= 45000) {
            valor = 878.85;
        }

        //De 45.000,01 à 50.000
        if (valorAvaliacao > 45000 && valorAvaliacao <= 50000) {
            valor = 976.05;
        }

        //De 50.000,01 à 60.000
        if (valorAvaliacao > 50000 && valorAvaliacao <= 60000) {
            valor = 1171.80;
        }

        //De 60.000,01 à 70.000
        if (valorAvaliacao > 60000 && valorAvaliacao <= 70000) {
            valor = 1367.55;
        }

        //De 70.000,01 à 80.000
        if (valorAvaliacao > 70000 && valorAvaliacao <= 80000) {
            valor = 1560.60;
        }

        //De 80.000,01 à 90.000
        if (valorAvaliacao > 80000 && valorAvaliacao <= 90000) {
            valor = 1756.35;
        }

        //De 90.000,01 à 100.000
        if (valorAvaliacao > 90000 && valorAvaliacao <= 100000) {
            valor = 1952.10;
        }

        //De 100.000,01 à 150.000
        if (valorAvaliacao > 100000 && valorAvaliacao <= 150000) {
            valor = 2340.90;
        }

        //De 150.000,01 à 200.000
        if (valorAvaliacao > 150000 && valorAvaliacao <= 200000) {
            valor = 2732.40;
        }

        //De 200.000,01 à 250.000
        if (valorAvaliacao > 200000 && valorAvaliacao <= 250000) {
            valor = 3122.55;
        }

        //De 250.000,01 à 300.000
        if (valorAvaliacao > 250000 && valorAvaliacao <= 300000) {
            valor = 3512.70;
        }
        //Acima de 300.000
        if (valorAvaliacao > 300000) {
            valor = 4293;
        }
        return valor + 10;

    }

}
