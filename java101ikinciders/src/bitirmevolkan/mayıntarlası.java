package java101ikinciders.src.bitirmevolkan;

public class mayıntarlası {
    int satırsayısı;
    int sutünsayısı;

    int mayınsayısı;

    public String[][] gamemap;
    public String[][] gameboard;

    int secilensatır;
    int secilensutün;

    int skor;
    int count;

    public mayıntarlası(int satırsayısı, int sutünsayısı) {
        this.satırsayısı = satırsayısı;
        this.sutünsayısı = sutünsayısı;
        this.mayınsayısı = (satırsayısı * sutünsayısı) / 4;
        this.gamemap = new String[satırsayısı][sutünsayısı];
        this.gameboard = new String[satırsayısı][sutünsayısı];
    }

    public void mayınpozisyonu() {
        while (mayınsayısı != count) {
            int a = (int) (Math.random() * this.satırsayısı);
            int b = (int) (Math.random() * this.sutünsayısı);
            if (this.gamemap[a][b] != "*") {
                this.gamemap[a][b] = "*";
                count++;
            }
        }
    }

    public void printgamemap() {

        System.out.println("Mayınların konumu");
        mayınpozisyonu();

        for (int i = 0; i < gamemap.length; i++) {
            for (int j = 0; j < gamemap[0].length; j++) {
                if (this.gamemap[i][j] != "*") {
                    System.out.print(this.gamemap[i][j] = "-" + " ");
                } else {
                    System.out.print(this.gamemap[i][j] + " ");//mayın pozisyonundan gelen * geliyor.
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


