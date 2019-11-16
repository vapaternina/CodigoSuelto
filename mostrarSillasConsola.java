public void mostrarSillasConsola() {
        //Recorrido 3D

        if (es3D) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 12; j++) {
                    if (!sillas[i][j].isEstaOcupada()) {
                        if (j != 12 - 1) {
                            System.out.print("_ ");
                        } else {
                            System.out.println("_");
                        }
                    } else {
                        if (j != 12 - 1) {
                            System.out.print("X ");
                        } else {
                            System.out.println("X");
                        }
                    }
                }
            }
        } else { //Generales y preferenciales
            for (int i = 0; i < 8; i++) {
                if (i == 0 || i == 1) {
                    for (int j = 0; j < 9; j++) {
                        if (!sillas[i][j].isEstaOcupada()) { //No está ocupada
                            if (j != 9 - 1) {
                                System.out.print("_ ");
                            } else {
                                System.out.println("_");
                            }
                        } else { //Ocupada
                            if (j != 9 - 1) {
                                System.out.print("X ");
                            } else {
                                System.out.println("X");
                            }
                        }
                    }
                } else {
                    for (int j = 0; j < 12; j++) {
                        if (!sillas[i][j].isEstaOcupada()) { //No está ocupada
                            if (j != 12 - 1) {
                                System.out.print("_ ");
                            } else {
                                System.out.println("_");
                            }
                        } else { //Ocupada
                            if (j != 12 - 1) {
                                System.out.print("X ");
                            } else {
                                System.out.println("X");
                            }
                        }
                    }
                }
            }
        }
        System.out.println("");
    }
