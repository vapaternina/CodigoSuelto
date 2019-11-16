String letras[] = {"A", "B", "C", "D", "E", "F", "G", "H"};

    public void identificarSillas() {
        if (es3D) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 12; j++) {
                    sillas[i][j].setIdentificador(letras[5 - i] + j);
                }
            }
        } else {
            for (int i = 0; i < 8; i++) {
                if (i == 0 || i == 1) {
                    for (int j = 0; j < 9; j++) {
                        sillas[i][j].setIdentificador(letras[i] + j);
                    }
                } else {
                    for (int j = 0; j < 12; j++) {
                        sillas[i][j].setIdentificador(letras[i] + j);
                    }
                }
            }
        }
        
    }
