package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam s = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        s.report();
        BaseBallTeam db = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        db.report();
        BaseBallTeam t = new BaseBallTeam("阪神タイガース",68,71,4);
        t.report();
        BaseBallTeam g = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        g.report();
        BaseBallTeam c = new BaseBallTeam("広島東洋カープ",66,74,3);
        c.report();
        BaseBallTeam d = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        d.report();
    }

}
