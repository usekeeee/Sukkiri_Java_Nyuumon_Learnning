package chap11;

class Shirt { /* シャツのデータや状態 */ }
class Towel { /* タオルのデータや状態 */ }
class Coat  { /* コートのデータや状態 */ }

// --- 1. インターフェースの定義 ---

public interface chap11_practice_CleaningService {
    Shirt washShirt(Shirt s);
    Towel washTowel(Towel t);
    Coat washCoat(Coat c);

}