public class MobilFile implements PowerInterface, NamaInterface, RodaInterface{
    private String power;
    private String nama;
    private Integer roda;

    @Override
    public void setPower(String power){
        this.power = power;
    }

    @Override
    public void setNama(String nama){
        this.nama = nama;
    }

    @Override
    public void setRoda(Integer roda){
        this.roda = roda;
    }

    public String getPower(){
        return power;
    }

    public String getNama(){
        return nama;
    }

    public Integer getRoda(){
        return roda;
    }
}
