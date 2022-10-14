public class Main {
    public static void main(String[] args) {
        double tutar=1000;

        BasekrediManager[] krediManagers=new BasekrediManager[]
                {new OgretmenkrediManager(),new TarimkrediManager(),new  OgrencikrediManager()};

          for (BasekrediManager krediManager: krediManagers){
              System.out.println(krediManager.hesapla(tutar));
          }

    }
}