package java101ikinciders.src.bitirmevolkan;

public class may�ntarlas� {
    int sat�rsay�s�;
    int sut�nsay�s�;

    int may�nsay�s�;

    public String[][] gamemap;
    public String[][] gameboard;

    int secilensat�r;
    int secilensut�n;

    int skor;
    int count;

    public may�ntarlas�(int sat�rsay�s�, int sut�nsay�s�) {
        this.sat�rsay�s� = sat�rsay�s�;
        this.sut�nsay�s� = sut�nsay�s�;
        this.may�nsay�s� = (sat�rsay�s� * sut�nsay�s�) / 4;
        this.gamemap = new String[sat�rsay�s�][sut�nsay�s�];
        this.gameboard = new String[sat�rsay�s�][sut�nsay�s�];
    }

    public void may�npozisyonu() {
        while (may�nsay�s� != count) {
            int a = (int) (Math.random() * this.sat�rsay�s�);
            int b = (int) (Math.random() * this.sut�nsay�s�);
            if (this.gamemap[a][b] != "*") {
                this.gamemap[a][b] = "*";
                count++;
            }
        }
    }

    public void printgamemap() {

        System.out.println("May�nlar�n konumu");
        may�npozisyonu();

        for (int i = 0; i < gamemap.length; i++) {
            for (int j = 0; j < gamemap[0].length; j++) {
                if (this.gamemap[i][j] != "*") {
                    System.out.print(this.gamemap[i][j] = "-" + " ");
                } else {
                    System.out.print(this.gamemap[i][j] + " ");//may�n pozisyonundan gelen * geliyor.
                }
            }
            System.out.println(" ");
        }
    }

        public void printGameBoard () {
            for (int i = 0; i < this.gameboard.length; i++) {
                for (int j = 0; j < this.gameboard[i].length; j++) {
                    System.out.print(this.gameboard[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


