/**
 * Created by Minde on 2017.05.09.
 */
public class Temperature {
    private double TKelvin;
    private double TCelcius;
    private double TFarenheit;
    private double TReomur;

    private final double constantKelvin = 273.16;
    private final double constantReomur = 0.8;

    public double kelvinToFarenheit(){
        return kelvinToCelcius()*1.8+32;
    }

    public double kelvinToCelcius(){
        return TKelvin-constantKelvin;
    }
    public double kelvinToReomur(){
        return kelvinToCelcius()*constantReomur;
    }

    public double getTKelvin() {
        return TKelvin;
    }

    public void setTKelvin(double TKelvin) {
        this.TKelvin = TKelvin;
    }
}
