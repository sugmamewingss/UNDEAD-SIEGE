package SATU.latihan;

import java.util.*;
import javax.swing.JOptionPane;

public class proyekakhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hp[] = new int[] { 100, 1, 1, 1, 1 };
        int dmg[] = new int[] { 2, 5, 7, 15, 20 };
        int crit = 0;
        int score = 0;
        int pengobatan = 5;
        int heal = 50;
        int banyakzombie = 0;
        boolean critical = false;

        String opening = JOptionPane.showInputDialog("Hai, Selamat datang! Silahkan masukkan namamu:");
        String nama = opening;

        if (nama.isEmpty()) {
            nama = "tanpa nama";
        }

        System.out
                .println("===========================================================================================");
        System.out
                .println("                        SELAMAT DATANG DI GAME UNDEAD SIEGE                                ");
        System.out.println(
                "                                    HAI " + nama + "                                     ");
        System.out
                .println("===========================================================================================");
        System.out.println("");
        System.out.println("Bakri: Disini, kamu akan bertahan hidup dari dunia yang sudah dipenuhi oleh Zombie!");
        System.out.println("Bakri: Tanpa banyak basa basi, sekarang pilih perlengkapanmu!");

        boolean awalan = true;
        while (awalan) {
            System.out.println("1. Pistol");
            System.out.println("2. Mini Dagger");
            System.out.println("3. Helmet + Vest");
            System.out.print("Kamu: ");
            String senjata = input.next();

            if (senjata.equals("1")) {
                System.out.println("");
                System.out.println("Bakri: Jika kamu memilih pistol, kamu akan mendapatkan atribut berupa:");
                System.out.println("Kelebihan: Crit hit + 20%");
                System.out.println("Kekurangan: Tidak ada penambahan atribut lainnya pada player selain critical");
                System.out
                        .println(
                                "Penjelasan: Pistol ini adalah satu-satunya senjata yang kamu dapatkan di awal permainan.");
                System.out.println("(Jadi, pergunakan dengan baik!)");
                System.out.println("");
                System.out.println("Kamu yakin ingin memilih ini?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Kamu: ");
                String pendapat = input.next();

                if (pendapat.equals("1")) {
                    System.out.println("Bakri: Baiklah, semoga kamu beruntung!");
                    System.out.println("");
                    dmg[0] += 5;
                    crit += 2;
                    awalan = false;
                }

                else if (pendapat.equals("2")) {
                    System.out.println("");
                    System.out.println("Bakri: Baiklah, pertimbangkan pilihanmu lebih baik lagi");
                    System.out.println("");
                }
            }

            else if (senjata.equals("2")) {
                System.out.println("");
                System.out.println("Bakri: Jika kamu memilih mini dagger, kamu akan mendapatkan atribut berupa:");
                System.out.println("Kelebihan: dmg + 12");
                System.out.println("Kekurangan: Tidak ada penambahan atribut lainnya pada player selain dmg");
                System.out
                        .println(
                                "Penjelasan: Mini dagger ini adalah satu-satunya senjata yang kamu dapatkan di awal permainan!");
                System.out.println("(Jadi, gunakan dengan baik!)");
                System.out.println("");
                System.out.println("Kamu yakin ingin memilih ini?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Kamu: ");
                String pendapat = input.next();

                if (pendapat.equals("1")) {
                    System.out.println("Bakri: Baiklah, semoga kamu beruntung!");
                    System.out.println("");
                    dmg[0] += 12;
                    awalan = false;
                }

                else if (pendapat.equals("2")) {
                    System.out.println("");
                    System.out.println("Bakri: Baiklah, pertimbangkan pilihanmu lebih baik lagi");
                    System.out.println("");
                }
            }

            else if (senjata.equals("3")) {
                System.out.println("");
                System.out.println("Bakri: Jika kamu memilih Helmet + Vest, kamu akan mendapatkan atribut berupa:");
                System.out.println("Kelebihan: HP + 100% darah player saat ini");
                System.out.println("Kekurangan: Tidak ada penambahan atribut lainnya pada player selain Hp");
                System.out
                        .println(
                                "Penjelasan: Ini adalah satu-satunya perlengkapan yang kamu dapatkan di awal permainan");
                System.out.println("(Jadi, gunakan dengan baik!)");
                System.out.println("");
                System.out.println("Kamu yakin ingin memilih ini?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Kamu: ");
                String pendapat = input.next();

                if (pendapat.equals("1")) {
                    System.out.println("Bakri: Baiklah, semoga kamu beruntung!");
                    System.out.println("");
                    hp[0] += 100;
                    awalan = false;
                }

                else if (pendapat.equals("2")) {
                    System.out.println("");
                    System.out.println("Bakri: Baiklah, pertimbangkan pilihanmu lebih baik lagi");
                    System.out.println("");
                }
            }

            else {
                System.out.println("");
                System.out.println("TIDAK ADA WAKTU LAGI! JANGAN BERCANDA!");
            }
        }

        System.out.println("Nah, setelah kamu memilih senjata, sekarang kamu bisa memilih kamu ingin menjadi apa");

        boolean skilllain = true;
        while (skilllain) {
            System.out.println("1. Bloodhunter");
            System.out.println("2. Shadow Warlord");
            System.out.println("3. Ravager");
            System.out.println("4. Death bringer");
            System.out.print("Kamu: ");
            String skill = input.next();

            switch (skill) {
                case "1":
                    System.out.println("");
                    System.out.println(
                            "BLOODHUNTER, seorang prajurit terkutuk yang telah menjual jiwanya kepada kekuatan gelap");
                    System.out.println(
                            "Kini bertarung dengan haus darah abadi, menyerap kehidupan musuh di setiap serangannya untuk memperkuat dirinya");
                    System.out.println("Atribut yang didapatkan: BLOOD FEAST");
                    System.out.println("Penjelasan:");
                    System.out.println(
                            "BLOOD FEAST: Kamu mendapatkan tambahan HP sebesar 20 HP dan");
                    System.out.println("Critical sebesar 10%");
                    System.out.println("");
                    System.out.println("Yakin mau pilih ini?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");

                    System.out.print("Kamu: ");
                    String misalkan1 = input.next();

                    if (misalkan1.equals("1")) {
                        System.out.println("");
                        System.out.println("SELAMAT KAMU TELAH MENYAMBUT BLOODHUNTER!");
                        hp[0] += 20;
                        crit += 1;
                        skilllain = false;
                        break;
                    } else if (misalkan1.equals("2")) {
                        System.out.println("");
                        System.out.println("Bakri: Baiklah, pikirkan dengan baik");
                        break;
                    }
                case "2":
                    System.out.println("");
                    System.out.println(
                            "SHADOW WARLORD, seorang pejuang bayangan legendaris yang menguasai seni serangan");
                    System.out.println(
                            "menggunakan kekuatan kegelapan untuk menyerang dengan presisi yang mematikan, menjadikan setiap tebasannya ancaman kritikal bagi musuhnya.");
                    System.out.println("Atribut yang didapatkan: SHADOWBLADE PRECISION");
                    System.out.println("Penjelasan:");
                    System.out.println(
                            "SHADOWBLADE PRECISION: Menambah chance critical dari setiap serangan yang diberikan sebanyak 30%");
                    System.out.println("");
                    System.out.println("Yakin mau pilih ini?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");
                    System.out.print("Kamu: ");
                    String misalkan2 = input.next();
                    if (misalkan2.equals("1")) {
                        System.out.println("");
                        System.out.println("SELAMAT KAMU TELAH MENYAMBUT SHADOW WARLORD!");
                        crit += 3;
                        skilllain = false;
                        break;
                    } else if (misalkan2.equals("2")) {
                        System.out.println("");
                        System.out.println("Bakri: Baiklah, pikirkan dengan baik");
                        break;
                    }
                case "3":
                    System.out.println("");
                    System.out.println(
                            "RAVAGER, seorang prajurit brutal dengan tubuh yang diperkuat oleh kekuatan kuno.");
                    System.out.println(
                            "mampu bertahan di medan perang dengan daya tahan luar biasa, menjadikannya benteng hidup yang sulit dihancurkan.");
                    System.out.println("Atribut yang didapatkan: IRONCLAD RESILIENCE");
                    System.out.println("Penjelasan:");
                    System.out.println(
                            "IRONCLAD RESILIENCE: Menambah Hp player sebanyak 40");
                    System.out.println("");
                    System.out.println("Yakin mau pilih ini?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");
                    System.out.print("Kamu: ");
                    String misalkan3 = input.next();
                    if (misalkan3.equals("1")) {
                        System.out.println("");
                        System.out.println("SELAMAT KAMU TELAH MENYAMBUT RAVAGER!");
                        hp[0] += 40;
                        skilllain = false;
                        break;
                    } else if (misalkan3.equals("2")) {
                        System.out.println("");
                        System.out.println("Bakri: Baiklah, pikirkan dengan baik");
                        break;
                    }
                case "4":
                    System.out.println("");
                    System.out.println(
                            "DEATH BRINGER, seorang pembawa kehancuran yang dipenuhi oleh kekuatan kegelapan.");
                    System.out.println(
                            "Memanfaatkan kekuatannya untuk meluluhlantakkan musuh dengan serangan mematikan yang tak dapat dihindari, meninggalkan kehancuran di setiap langkahnya.");
                    System.out.println("Atribut yang didapatkan: SHADOW CLEVER");
                    System.out.println("Penjelasan:");
                    System.out.println(
                            "SHADOW CLEVER: Menambah dmg yang diberikan oleh player sebanyak 15");
                    System.out.println("");
                    System.out.println("Yakin mau pilih ini?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");
                    System.out.print("Kamu: ");
                    String misalkan4 = input.next();
                    if (misalkan4.equals("1")) {
                        System.out.println("");
                        System.out.println("SELAMAT KAMU TELAH MENYAMBUT DEATH BRINGER!");
                        dmg[0] += 15;
                        skilllain = false;
                        break;
                    } else if (misalkan4.equals("2")) {
                        System.out.println("");
                        System.out.println("Bakri: Baiklah, pikirkan dengan baik");
                        break;
                    }
                default:
                    System.out.println("");
                    System.out.println("PILIHAN TIDAK ADA!");
                    break;
            }

        }

        System.out.println("");
        System.out.println("Sekarang, coba cek status kamu dengan masukan '/stat'");

        boolean kedua = true;
        while (kedua) {
            System.out.print("Kamu: ");
            String perintahstatus = input.next();

            if (perintahstatus.equals("/stat")) {
                proyekmethod2.status(hp[0], dmg[0], crit, nama, pengobatan);
                kedua = false;
            }

            else {
                System.out.println("");
                System.out.println("Ayolah, jangan bercanda lagi!");
            }
        }

        System.out.println("Nah, kamu sudah lihat kan status kamu?");

        boolean hebat = true;
        while (hebat) {
            System.out.println("1. Sudah");
            System.out.println("2. Belum");

            System.out.print("Kamu: ");
            String masukan = input.next();

            if (masukan.equals("1") || masukan.equalsIgnoreCase("Sudah")) {
                hebat = false;
            }

            else {
                System.out.println("SUDAH APA BELUM? JANGAN NGELAMUN!");
            }
        }

        System.out.println("");
        System.out.println("Sekarang, mari kita coba mekanisme critical hit");
        System.out.println("Coba kamu tinju punching bag disana");
        System.out.println("");
        System.out.println("Kamu tersadar, ternyata kamu berada di sebuah ruangan...");
        System.out.println(nama + ": Hmmm, sepertinya aku berada di sebuah gudang tua...");
        System.out.println(nama + ": Yasudahlah.");
        System.out.println("");
        System.out.println("(" + nama + " melihat ke sekitar...)");
        System.out.println("(" + nama + " melihat ada punching bag diujung ruangan)");
        System.out.println("Sontak " + nama + " meninju punching bag tersebut");
        System.out.println("DRAGG!");
        System.out.println("");
        System.out.println("Bakri: Nice! Serangan hebat!");
        System.out.println("");
        System.out.println("Bakri: Baiklah, sudah jelas semua kan?");
        System.out.println("Bakri: HAHAHAHA! SUDAH SAATNYA!");
        System.out.println("(Sontak Bakri mendobrak pintu)");
        System.out.println("*BRUAGHHHH!!! (suara pintu didobrak)");
        System.out.println("AYO ANAK MUDA, KITA HABISI SEMUA ZOMBIE-ZOMBIE INI!");

        System.out.println("");
        System.out.println("");
        System.out.println("*Kamu berjalan keluar gudang tua tersebut...");
        System.out.println("*Kamu melihat ada banyak zombie-zombie yang berjalan ke arahmu...");
        System.out.println(
                "Bakri: Kamu sudah tau kan apa yang harus kamu lakukan? Ayo anak muda, mari kita bertahan sampai titik darah terakhir!");
        System.out.println("");
        System.out.println(nama + ": Sudah saatnya...");

        int hasilrandom[] = proyekmethod2.muncul(hp[1], banyakzombie);
        hp[1] = hasilrandom[0];
        banyakzombie = hasilrandom[1];

        boolean permainan = true;

        while (permainan) {
            System.out.println("");
            int hasilgiliranlawan[] = proyekmethod2.giliranlawan(hp[0], hp[1], hp[2], hp[3], hp[4], dmg[1], dmg[2],
                    dmg[3], dmg[4]);
            hp[0] = hasilgiliranlawan[0];
            proyekmethod2.hpstatus(hp[0]);
            proyekmethod2.status(hp[0], dmg[0], crit, nama, pengobatan);

            if (hp[0] <= 0) {
                System.out.println("");
                System.out.println("ASTAGA! " + nama + ", KAMU TIDAK APA APA?! HEY " + nama + ", BANGUNLAH!");
                System.out.println("*" + nama + " mendengar suara itu mulai samar - samar...");
                System.out.println("");
                System.out.println("");
                System.out.println("Hingga kamu sadari, kamu telah sepenuhnya kehilangan kesadaranmu...");
                System.out.println("");
                permainan = proyekmethod2.turnoff(permainan);
                break;
            }

            critical = proyekmethod2.gamble(critical, crit);

            int hasilgiliranplayer[] = proyekmethod2.giliranplayer(hp[0], hp[1], hp[2], hp[3], hp[4],
                    banyakzombie, dmg[0], critical, pengobatan, heal, crit, score, nama);

            hp[0] = hasilgiliranplayer[0];
            hp[1] = hasilgiliranplayer[1];
            hp[2] = hasilgiliranplayer[2];
            hp[3] = hasilgiliranplayer[3];
            hp[4] = hasilgiliranplayer[4];
            pengobatan = hasilgiliranplayer[5];

            int hasilcekzombiemati[] = proyekmethod2.cekzombiemati(hp[1], hp[2], hp[3], hp[4], banyakzombie, score,
                    pengobatan);

            hp[1] = hasilcekzombiemati[0];
            hp[2] = hasilcekzombiemati[1];
            hp[3] = hasilcekzombiemati[2];
            hp[4] = hasilcekzombiemati[3];
            banyakzombie = hasilcekzombiemati[4];
            score = hasilcekzombiemati[5];
            pengobatan = hasilcekzombiemati[6];

            proyekmethod2.hpstatus(hp[0]);

            System.out.println("");

            if (banyakzombie == 0) {
                int hasilterus[] = proyekmethod2.terus(hp[1], hp[2], hp[3], hp[4], banyakzombie);
                hp[1] = hasilterus[0];
                hp[2] = hasilterus[1];
                hp[3] = hasilterus[2];
                hp[4] = hasilterus[3];
                banyakzombie = hasilterus[4];
            }
        }
        proyekmethod2.gameover(score);
    }
}
