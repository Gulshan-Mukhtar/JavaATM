import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    private static double balans = 941;

    private static double avansBalans = 1500;

    private static double avansBorc = 0;

    private static int pin = 1515;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Xoş gəlmişsiniz");


        int i = 0;

        while (true) {

            System.out.println("Xahiş edirik, PİN şifrənizi daxil edəsiniz");

            pinblock();

            if (pin == pin) {
                variants();

                int variant = input.nextInt();

                switch (variant) {

                    case 1:
                        advanceOffer();
                        break;


                    case 2:
                        avanceDept();


                        break;


                    case 3:
                        cashingOut();
                        break;


                    case 4:
                        balance();
                        break;

                    case 5:
                        atmPinChance();
                        break;

                    case 9:
                }

                int i = -1;
                        System.out.println("Zəhmət olmasa kartınzı götürün");
                        System.exit(0);


                }

            }
        }


    public static void emeliyyatinSonu() {

        System.out.println("Eməliyyat aparılır.Zəhmət olmasa pulları götürün");
        System.out.println("------------------------------------------");


    }


    public static void variants() {

        System.out.println("------------------------------------------");
        System.out.println("Zəhmət olmasa seçiminizi edin");
        System.out.println("1.Avans");
        System.out.println("2.Avans borc");
        System.out.println("3.Nağdlaşdırma");
        System.out.println("4.Balans");
        System.out.println("5.Sifrə dəyistirmək");
        System.out.println("9.İmtina etmək");
        System.out.println("-------------------------------------------");

    }

    public static void avance() {

        Scanner input = new Scanner(System.in);
        System.out.println("Avans balans: " + avansBalans + "AZN");
        System.out.println("Avans çəkmək istəyiniz məbləği daxil edin");


        double avans = input.nextDouble();
        if (avansBalans > 0) {

            if (balans > 0) {
                System.out.println("Balansınızda kifayət qədər məbləğ olduğu üçün sizə avans verilmir");

            } else if (avans <= 500 && avans > 0) {

                System.out.println(avans + " azn avans alındı");
                System.out.println("Sizin avans borcunuz:" + (avans + ((avans * 1) / 100)) + " AZN təşkil edir");
                avansBalans = avansBalans - avans;
                avansBorc = avansBorc + (avans + ((avans * 1) / 100));
                System.out.println("Avans hesabınızdan daha: " + avansBalans + " AZN pul çəkə bilərsiniz");

                emeliyyatinSonu();

            } else if (avans <= 1000 && avans > 500) {
                System.out.println("Sizin borcunuz:" + (avans + ((avans * 2) / 100)) + " AZN təşkil edir");
                avansBalans = avansBalans - avans;
                avansBorc = avansBorc + (avans + ((avans * 2) / 100));

                System.out.println("Avans hesabınızdan daha: " + avansBalans + " AZN pul çəkə bilərsiniz");


                emeliyyatinSonu();

            } else if (avans <= 1500 && avans > 1000) {
                System.out.println("Sizin borcunuz:" + (avans + ((avans * 3) / 100)) + " AZN");
                avansBalans = avansBalans - avans;
                avansBorc = avansBorc + (avans + ((avans * 3) / 100));

                System.out.println("Avans hesabınızdan daha: " + avansBalans + " AZN pul çəkə bilərsiniz");

                emeliyyatinSonu();


            } else {
                System.out.println("Çəkə biləcəyiniz maksimum avans 1500 AZN teşkil edir");
                System.out.println("------------------------------------------");


            }
        } else {
            System.out.println("AvansBlanasınızda kifayət qədər məbləğ yoxdur");
            System.out.println("------------------------------------------");

        }


    }

    public static void cashingOut() {
        System.out.println("Sizin balansınız " + balans + "AZN təşkil edir");
        System.out.println("Çıxartmaq istədiyiniz məbləği daxil  edin");

        Scanner input = new Scanner(System.in);

        double amount = input.nextInt();
        if (balans >= amount) {
            System.out.println("Hesabınızda " + balans + "AZN pul var idi");
            System.out.println("Hesabınızdan " + amount + " AZN pul çıxarıldı");
            System.out.println("Cari balans: " + (balans - amount) + " AZN təşkil edir");
            emeliyyatinSonu();
            balans = balans - amount;


        } else if (balans < amount) {
            System.out.println("Balansınız nəzərdə tutulmuş məbləğdən kiçikdir.Avans seçənəklərimizdən istifadə etməyiniz tövsiyyə olunur");
            advanceOffer();


        }
    }

    public static void balance() {

        System.out.println("Balans: " + balans + " AZN");
        System.out.println("------------------------------------------");


    }

    public static void atmPinChance() {


        System.out.println("Hörmətli müştəri, nəzərinizə çatdıraq ki Pin Chance xidməti pulludur. Xidmət haqqı olaraq balansınzıdan 3 AZN tutulur.");
        System.out.println("Şərtlər ilə razısınızsa,zəhmət olmasa köhnə sifrənizi daxil edin");
        pinblock();

        Scanner input = new Scanner(System.in);

        if (pin == pin) {

            if (balans > 3 || avansBalans > 3) {


                System.out.println("Zəhmət olmasa yeni şifrənizi daxil edin");
                int newPin = input.nextInt();
                System.out.println("Zəhmət olmasa yeni şifənizi bir daha daxil edin");
                int newPin2 = input.nextInt();


                if (newPin == newPin2) {
                    System.out.println("Şifrəniz uğurla güncəllənmişdir!");

                    pin = newPin2;
                    double pinChanceAmount = 3;


                    if (balans > 3) {

                        System.out.println("Balansınızdan 3 AZN pul cıxarıldı");
                        System.out.println("Yekun balans:" + (balans - pinChanceAmount));
                        balans = balans - pinChanceAmount;
                        System.out.println("------------------------------------------");

                    } else if (avansBalans > 3) {

                        System.out.println("Avansınızdan " + pinChanceAmount + " məbləğində pul çıxarıldı");
                        System.out.println(" Yekun avans borc " + (pinChanceAmount + (pinChanceAmount * 1) / 100));
                        avansBalans = avansBalans - (pinChanceAmount + (pinChanceAmount * 1) / 100);
                        avansBorc = avansBorc + (pinChanceAmount + (pinChanceAmount * 1) / 100);

                        System.out.println("------------------------------------------");


                    }


                } else {
                    System.out.println("Daxil etdiyiniz şifrə yalnışdır");
                }


            } else {
                System.out.println("PinChance xidmətindən yararlanmaq üçün \"Balans\" və \"AvansBlansınızda\" yetərli məbləğ yoxdur");
            }

        }
    }


    public static void advanceOffer() {

        Scanner input = new Scanner(System.in);
        System.out.println("Çəkə biləcəyiniz maksimum avans 1500 AZN təşkil edir. Nəzərinizə çatdıraq ki, balansınızda kifayət qədər məbləq olduğu halda sizə avans verilmir.");
        System.out.println("0-500 arası məbləğ üçün avans borc 1%");
        System.out.println("500-1000 arası məbləğ üçün avans borc 2%");
        System.out.println("1000-1500 arası məbləğ üçün avans borc 3% ilə hesablanır");

        System.out.println("Avans təkliflərindən razısınız mı? Razısınızsa [1]");
        System.out.println("Avans təkliflərindən razı deyilsinizsə [2] ");
        System.out.println("------------------------------------------");

        int avansTeklifiSecim = input.nextInt();
        if (avansTeklifiSecim == 1) {
            avance();
        } else {
            System.out.println("Sizə avans xidmətindən istifadə etməyə icazə verilmir. Avans xidmətini yenidən aktif etməək istədiyiniz halda filialımıza yaxınlaşmağınız xahiş olunur");
            System.exit(0);
            System.out.println("------------------------------------------");

        }


    }

    public static void avanceDept() {
        System.out.println("Sizin avans borcunuz:" + avansBorc);
        System.out.println("------------------------------------------");


    }

    public static void pinblock() {

        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        int entry = scanner.nextInt();
        while (entry != pin && tries < 3) {
            System.out.println("Yalnış şifrə");
            System.out.println("Xahiş edirik, PİN şifrənizi daxil edəsiniz");
            entry = scanner.nextInt();
            tries++;
        }
        if (tries >= 3 && entry != pin) {
            System.out.println("Kartınız blok edilmişdir.Kartınızı yenidən aktif etmək üçün  fliala yaxınlaşın");
            System.out.println("------------------------------------------");

            System.exit(0);

        }

    }


}
