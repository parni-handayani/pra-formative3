import java.util.Scanner;

public class MyApp{
    public static void main(String[] args) {
        System.out.println("=== Cek kendaraan roda dua dan roda empat ===");
        System.out.print("Jenis kendaraan beroda: ");
        Integer inputJumlahRoda = MyApp.inputInteger();

        switch (inputJumlahRoda) {
            case 2:
                motor(2);
                break;
            case 4:
                mobil(4);
                break;
            default:
                System.out.println("Jenis kendaraan tidak termasuk dalam pengecekan");
                break;
        } 
    }

    public static void motor(Integer roda) {
        Scanner scanner = new Scanner(System.in);
        MotorFile motor = new MotorFile();
        
        System.out.print("Jenis motor: ");
        String inputMerk = scanner.nextLine();

        System.out.print("Apakah motor menyala? ketikkan (on/off): ");
        String inputPower = scanner.nextLine();
                
        motor.setNama(inputMerk);
        String getNama = motor.getNama();

        motor.setPower(inputPower);
        String getPower = motor.getPower();

        motor.setRoda(roda);
        Integer getRoda = motor.getRoda();

        if (getPower.equals("on")){
            System.out.println("Jenis motor " + getNama +  " menyala dan jumlah roda lengkap yaitu " + getRoda);
        } else {
            System.out.println("Jenis motor " + getNama +  " tidak menyala dan jumlah roda lengkap yaitu " + getRoda);
        }
    }


    public static void mobil(Integer roda){
        Scanner scanner = new Scanner(System.in);
        MobilFile mobil = new MobilFile();
        
        System.out.print("Jenis mobil: ");
        String inputMerk = scanner.nextLine();

        System.out.print("Apakah mobil menyala? ketikkan (on/off): ");
        String inputPower = scanner.nextLine();
                
        mobil.setNama(inputMerk);
        String getNama = mobil.getNama();

        mobil.setPower(inputPower);
        String getPower = mobil.getPower();

        mobil.setRoda(roda);
        Integer getRoda = mobil.getRoda();

        if (getPower.equals("on")){
            System.out.println("Jenis mobil " + getNama +  " menyala dan jumlah roda lengkap yaitu " + getRoda);
        } else {
            System.out.println("Jenis mobil " + getNama +  " tidak menyala dan jumlah roda lengkap yaitu " + getRoda);
        }
    }

    public static Integer inputInteger(){
        Scanner scanner = new Scanner(System.in);
        Integer inpuInteger = scanner.nextInt();
        return inpuInteger;
    }
}