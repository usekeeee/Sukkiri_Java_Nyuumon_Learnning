package chap15_quiz;
public class chap15_quiz_PathBuilder {
    public static void main(String[] args) {
        // テストケース1: 末尾に \ が付いていない場合
        String folder1 = "c:\\javadev";
        String file1 = "readme.txt";
        String path1 = getFullPath(folder1, file1);
        System.out.println("結果1: " + path1); // c:\javadev\readme.txt

        // テストケース2: 末尾に \ が付いている場合
        String folder2 = "c:\\javadev\\";
        String file2 = "readme.txt";
        String path2 = getFullPath(folder2, file2);
        System.out.println("結果2: " + path2); // c:\javadev\readme.txt
    }

    // 2つの文字列を連結して正しいパスを返すメソッド
    public static String getFullPath(String folder, String file) {
        // 末尾が "\" で終わっているかチェック
        if (!folder.endsWith("\\")) {
            // 終わっていなければ末尾に "\" を追加する
            folder = folder + "\\";
        }
        // 最後にファイルを結合して返す
        return folder + file;
    }
}