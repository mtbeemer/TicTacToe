package TicTacToe;

class WinCheck {

    static int arnNs[] = new int[9];
    static boolean isX;

    static void set(int[] _arnN, boolean _isX) {
        arnNs = _arnN;
        isX = _isX;
    }

    static void print() {
        for (int i = 0; i < 9; i++) {
            System.out.println(arnNs[i]);
        }
    }

    static void Check() {

        if (arnNs[0] == 1) {//checks 123, 147, 159
            if (arnNs[1] == 1) {
                if (arnNs[2] == 1) {
                    PanDisp.pangame.UpdawgX();
                }
            }
            if (arnNs[3] == 1) {
                if (arnNs[6] == 1) {
                    PanDisp.pangame.UpdawgX();
                }
            }
            if (arnNs[4] == 1) {
                if (arnNs[8] == 1) {
                    PanDisp.pangame.UpdawgX();
                }
            }
        }
        if (arnNs[1] == 1 && arnNs[4] == 1 && arnNs[7] == 1) {
            PanDisp.pangame.UpdawgX();
        }
        if (arnNs[3] == 1) {
            if (arnNs[(4)] == 1) {
                if (arnNs[(5)] == 1) {
                    PanDisp.pangame.UpdawgX();
                }
            }
        }
        if (arnNs[2] == 1) { // checks 3,6,9
            if (arnNs[(5)] == 1) {
                if (arnNs[(8)] == 1) {
                    PanDisp.pangame.UpdawgX();
                }
            }
        }
        if (arnNs[5] == 1) {
            if (arnNs[(4)] == 1) {
                if (arnNs[(3)] == 1) {
                    PanDisp.pangame.UpdawgO();
                }
            }
        }

        if (arnNs[6] == 1) { // checks 7,8,9
            if (arnNs[(7)] == 1) {
                if (arnNs[(8)] == 1) {
                    PanDisp.pangame.UpdawgX();
                }
            }
        }
        if (arnNs[2] == 1) {
            if (arnNs[4] == 1) {
                if (arnNs[6] == 1) {
                    PanDisp.pangame.UpdawgX();
                    System.out.println("rut :D");
                }
            }
        }//X check stops here :D

        if (arnNs[0] == 2) {//checks 123, 147, 159
            if (arnNs[1] == 2) {
                if (arnNs[2] == 2) {
                    PanDisp.pangame.UpdawgO();
                }
            }
            if (arnNs[3] == 2) {
                if (arnNs[6] == 2) {
                    PanDisp.pangame.UpdawgO();
                }
            }
            if (arnNs[4] == 2) {
                if (arnNs[8] == 2) {
                    PanDisp.pangame.UpdawgO();
                }
            }
        }
        if (arnNs[1] == 2 && arnNs[4] == 2 && arnNs[7] == 2) {
            PanDisp.pangame.UpdawgO();
        }
        if (arnNs[3] == 2) {
            if (arnNs[(4)] == 2) {
                if (arnNs[(5)] == 2) {
                    PanDisp.pangame.UpdawgO();
                }
            }
        }
        if (arnNs[2] == 2) { // checks 3,6,9
            if (arnNs[(5)] == 2) {
                if (arnNs[(8)] == 2) {
                    PanDisp.pangame.UpdawgO();
                }
            }
        }
        if (arnNs[5] == 2) {
            if (arnNs[(4)] == 2) {
                if (arnNs[(3)] == 2) {
                    PanDisp.pangame.UpdawgO();
                }
            }
        }

        if (arnNs[6] == 2) { // checks 7,8,9
            if (arnNs[(7)] == 2) {
                if (arnNs[(8)] == 2) {
                    PanDisp.pangame.UpdawgO();
                }
            }
        }
        if (arnNs[2] == 2) {
            if (arnNs[4] == 2) {
                if (arnNs[6] == 2) {
                    PanDisp.pangame.UpdawgX();
                    System.out.println("rut :D");
                }
            }
        }


    }
}
