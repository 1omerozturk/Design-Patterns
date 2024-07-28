package Iterator;

import Iterator.AgacIterator.Agac;

public class Main {
    public static void main(String[] args) {

        // ilk dizi için iterator örneği 
        
        // Listeleme.Listele(new Dizi());

        // Agac örneğini kullanabilmek için 
        Agac agac=new Agac(3);
        Agac sag=new Agac(7);
        Agac sol=new Agac(9);
        Agac sag2=new Agac(15);
        agac.solaEkle(sol);
        agac.sagaEkle(sag);
        sag.sagaEkle(sag2);

        Listeleme.Listele(agac);
    }

}
