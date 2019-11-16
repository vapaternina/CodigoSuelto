public int sillasDisponibles() {
        int nDisponibles = 0;
        if (es3D) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 12; j++) {
                    if (!sillas[i][j].isEstaOcupada()) {
                        nDisponibles++;
                    }
                }
            }
        } else {
            for (int i = 0; i < 8; i++) {
                if (i == 0 || i == 1) {
                    for (int j = 0; j < 9; j++) {
                        if (!sillas[i][j].isEstaOcupada()) {
                            nDisponibles++;
                        }
                    }
                } else {
                    for (int j = 0; j < 12; j++) {
                        if (!sillas[i][j].isEstaOcupada()) {
                            nDisponibles++;
                        }
                    }
                }
            }
        }
        return nDisponibles;
    }
