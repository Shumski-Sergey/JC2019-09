package nbogdan.Lesson6.Task3;

public class Main {
    public static void main(String[] args) {
        CyberKiller[] suicideSquad = new CyberKiller[]{new CyberKiller("Андрей", 65, "холодильник", false, 300),
                new CyberKiller("Настюша", 20, "микроволновка", false, 200),
                new CyberKiller("Фюрер", 3, "пульт", true, 666)};
        System.out.println("Шел 2049 год... \nApple выпустила новый микрочип для бытовой техники и натренировала нейросеть для управления ими.\nОни настолько сильно тренировали сеть на ошибках, что она начала распознавать человека как ошибку...\nВ обычное воскресное утро Джеймс Гослинг пошел на кухню, чтобы выпить уже готовую чашечку эспрессо, которую его машинка должна была сварить.\nНо вместо этого он увидел боевой отряд роботов.\n");
        for(CyberKiller xxx: suicideSquad) {
            xxx.show();
        }
    }
}
