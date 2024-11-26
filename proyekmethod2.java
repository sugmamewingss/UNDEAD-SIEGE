package SATU.latihan;

import java.util.Random;
import java.util.Scanner;

public class proyekmethod2 {

    public static int[] terus(int wzombie, int nzombie, int pzombie, int gzombie, int banyakzombie) {
        Random spawn = new Random();
        int zombieterus = spawn.nextInt(4) + 1;

        if (zombieterus == 1) {
            banyakzombie += 1;
            wzombie += 9;
            System.out.println("");
            System.out.println("Kamu melihat ada " + banyakzombie + " zombie lemah muncul di depanmu!");
        } else if (zombieterus == 2) {
            banyakzombie += 1;
            nzombie += 11;
            System.out.println("");
            System.out.println("Kamu melihat ada " + banyakzombie + " zombie biasa muncul di depanmu!");
        } else if (zombieterus == 3) {
            banyakzombie += 1;
            pzombie += 7;
            System.out.println("");
            System.out.println("Kamu melihat ada " + banyakzombie + " zombie terinfeksi muncul di depanmu!");
        } else if (zombieterus == 4) {
            banyakzombie += 1;
            gzombie += 29;
            System.out.println("");
            System.out.println("Kamu melihat ada " + banyakzombie + " GARGANTUAR ZOMBIE muncul di depanmu!");
        }
        return new int[] { wzombie, nzombie, pzombie, gzombie, banyakzombie };

    }

    public static int[] muncul(int wzombie, int banyakzombie) {
        banyakzombie += 1;
        wzombie += 9;
        System.out.println("");
        System.out.println("Kamu melihat ada " + banyakzombie + " zombie lemah muncul di depanmu!");
        return new int[] { wzombie, banyakzombie };
    }

    public static int[] giliranlawan(int hp, int wzombie, int nzombie, int pzombie, int gzombie, int dwzombie,
            int dnzombie,
            int dpzombie, int dgzombie) {
        if (wzombie > 1) {
            System.out.println("Giliran lawan!");
            hp -= dwzombie;
            System.out.println("Zombie lemah memberikan kamu damage sebesar " + dwzombie + " HP!");
            if (hp <= 0) {
                hp = 0;
            }
            System.out.println("HP kamu sekarang: " + hp);
            System.out.println("");
        }

        if (nzombie > 1) {
            System.out.println("Giliran lawan!");
            hp -= dnzombie;
            System.out.println("Zombie biasa memberikan kamu damage sebesar " + dnzombie + " HP!");
            if (hp <= 0) {
                hp = 0;
            }
            System.out.println("HP kamu sekarang: " + hp);
            System.out.println("");

        }
        if (pzombie > 1) {
            System.out.println("Giliran lawan!");
            hp -= dpzombie;
            System.out.println("Zombie terinfeksi memberikan kamu damage sebesar " + dpzombie + " HP!");
            if (hp <= 0) {
                hp = 0;
            }
            System.out.println("HP kamu sekarang: " + hp);
            System.out.println("");

        }
        if (gzombie > 1) {
            System.out.println("Giliran lawan!");
            hp -= dgzombie;
            System.out.println("GARGANTUAR ZOMBIE memberikan kamu damage sebesar " + dgzombie + " HP!");
            if (hp <= 0) {
                hp = 0;
            }
            System.out.println("HP kamu sekarang: " + hp);
            System.out.println("");
        }
        return new int[] { hp, dwzombie, dnzombie, dpzombie, dgzombie };
    }

    public static int[] giliranplayer(String nama, int hp, int wzombie, int nzombie, int pzombie, int gzombie,
            int banyakzombie, int dmg, boolean critical, int pengobatan, int heal, int crit, int score) {

        System.out.println("");
        System.out.println("Giliranmu, " + nama + "!");
        System.out.println("1. Serang");
        System.out.println("2. Pengobatan");
        System.out.println("3. Exit (Pertimbangkan dengan bijak!)");

        Scanner input = new Scanner(System.in);
        System.out.print("Pilih aksi: ");
        int turnplayer = input.nextInt();

        switch (turnplayer) {
            case 1:
                if (wzombie > 1) {
                    if (critical) {
                        wzombie -= dmg * 2;
                        System.out.println("");
                        System.out.println("CRITICAL!");
                        System.out.println("Kamu memberikan damage kepada zombie lemah sebesar " + (dmg * 2) + " HP!");
                        break;
                    } else {
                        wzombie -= dmg;
                        System.out.println("");
                        System.out.println("Kamu memberikan damage kepada zombie lemah sebesar " + dmg + " HP!");
                    }
                    break;
                }
                if (nzombie > 1) {
                    if (critical) {
                        nzombie -= dmg * 2;
                        System.out.println("");
                        System.out.println("CRITICAL!");
                        System.out.println("Kamu memberikan damage kepada zombie biasa sebesar " + (dmg * 2) + " HP!");
                        break;
                    } else {
                        nzombie -= dmg;
                        System.out.println("");
                        System.out.println("Kamu memberikan damage kepada zombie biasa sebesar " + dmg + " HP!");
                    }
                    break;
                }
                if (pzombie > 1) {
                    if (critical) {
                        pzombie -= dmg * 2;
                        System.out.println("");
                        System.out.println("CRITICAL!");
                        System.out.println(
                                "Kamu memberikan damage kepada zombie terinfeksi sebesar " + (dmg * 2) + " HP!");
                        break;
                    } else {
                        pzombie -= dmg;
                        System.out.println("");
                        System.out.println("Kamu memberikan damage kepada zombie terinfeksi sebesar " + dmg + " HP!");
                    }
                    break;
                }
                if (gzombie > 1) {
                    if (critical) {
                        gzombie -= dmg * 2;
                        System.out.println("");
                        System.out.println("CRITICAL!");
                        System.out.println(
                                "Kamu memberikan damage kepada GARGANTUAR ZOMBIE sebesar " + (dmg * 2) + " HP!");
                        break;
                    } else {
                        gzombie -= dmg;
                        System.out.println("");
                        System.out.println("Kamu memberikan damage kepada GARGANTUAR ZOMBIE sebesar " + dmg + " HP!");
                    }
                    break;
                }
                break;

            case 2:
                if (pengobatan > 0) {
                    hp += heal;
                    pengobatan--;
                    System.out.println("HP kamu dipulihkan sebanyak " + heal + " HP!");
                    break;
                } else {
                    System.out.println("Kamu tidak memiliki pengobatan!");
                }
                break;

            case 3:
                System.out.println("");
                System.out.println("Kamu yakin ingin keluar?");

                boolean exit = true;
                while (exit) {
                    System.out.println("");
                    System.out.println("Ketik EXIT untuk keluar");
                    System.out.println("");
                    System.out.print("System: ");
                    String keluar = input.next();
                    if (keluar.equalsIgnoreCase("EXIT")) {
                        gameover(score);
                        System.exit(0);
                    } else {
                        System.out.println("");
                        System.out.println("Masukkan perintah yang benar!");
                    }
                }

            default:
                System.out.println("Pilihan tidak valid! Giliranmu dilewatkan.");
                break;
        }
        return new int[] { hp, wzombie, nzombie, pzombie, gzombie, pengobatan };
    }

    public static int[] cekzombiemati(int wzombie, int nzombie, int pzombie, int gzombie, int banyakzombie, int score,
            int pengobatan) {
        if (wzombie <= 0) {
            banyakzombie--;
            score += 2;
            wzombie = 1;
            System.out.println("Zombie lemah telah mati!");
        } else if (nzombie <= 0) {
            banyakzombie--;
            score += 4;
            nzombie = 1;
            System.out.println("Zombie biasa telah mati!");
        } else if (pzombie <= 0) {
            banyakzombie--;
            score += 10;
            pzombie = 1;
            pengobatan += 1;
            System.out.println("Zombie terinfeksi telah mati!");
        } else if (gzombie <= 0) {
            banyakzombie--;
            score += 15;
            gzombie = 1;
            System.out.println("GARGANTUAR ZOMBIE telah mati!");
        } else {
            score += 0;
        }

        return new int[] { wzombie, nzombie, pzombie, gzombie, banyakzombie, score, pengobatan };
    }

    public static boolean turnoff(boolean permainan) {
        return false;
    }

    public static int hpstatus(int hp) {
        return hp;
    }

    public static int[] status(int hp, int dmg, int crit, String nama, int pengobatan) {
        crit *= 10;
        if (hp <= 0) {
            hp = 0;
        }
        System.out.println("==================================");
        System.out.println("    STATUS " + nama + ":");
        System.out.println("    HP             : " + hpstatus(hp));
        System.out.println("    Damage         : " + dmg);
        System.out.println("    Crit Percentage: " + crit + "%");
        System.out.println("    Pengobatan     : " + pengobatan);
        System.out.println("==================================");
        crit /= 10;
        return new int[] { hp, dmg, crit, pengobatan };
    }

    public static boolean crittrue(boolean critical) {
        return true;
    }

    public static boolean critfalse(boolean critical) {
        return false;
    }

    public static boolean gamble(boolean critical, int crit) {
        Random gamble = new Random();
        int krit = gamble.nextInt(10);
        if (krit <= crit) {
            critical = crittrue(critical);
        } else {
            critical = critfalse(critical);
        }
        return critical;
    }

    public static int gameover(int score) {
        System.out.println("=========================================================");
        System.out.println("                        GAME OVER                        ");
        System.out.println("                       Your Score: " + score + "                    ");
        System.out.println("                  THANK YOU FOR PLAYING                  ");
        System.out.println("=========================================================");
        return score;
    }

}
