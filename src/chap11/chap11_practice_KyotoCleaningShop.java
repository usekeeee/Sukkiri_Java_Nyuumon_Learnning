package chap11;

public class chap11_practice_KyotoCleaningShop implements chap11_practice_CleaningService {
    String ownerName; // キャメルケースに修正
    String address;
    String phone;

    /* シャツを洗う */
    public Shirt washShirt(Shirt s) {
        // 大型洗濯機15分
        System.out.println("シャツを大型洗濯機で15分洗いました。");
        return s;
    }

    /* タオルを洗う */
    public Towel washTowel(Towel t) {
        // 大型洗濯機10分
        System.out.println("タオルを大型洗濯機で10分洗いました。");
        return t;
    }

    /* コートを洗う */
    public Coat washCoat(Coat c) {
        System.out.println("コートをドライクリーニングしました。");
        return c;
    }
}