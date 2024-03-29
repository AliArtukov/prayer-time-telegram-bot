package uz.pdp.model;
/*
Created by Ali Artukov
*/

public class ProjectProperties {
    public static final String BOT_TOKEN = ""; //Enter your telegram bot token
    public static final String BOT_USERNAME = ""; //Enter your telegram bot username
    public static final Integer[] REGION_CODE = new Integer[]{1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 66, 67, 68, 69, 70, 71, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94};
    public static final String[] REGION_NAME = new String[]{"Андижон", "Бекобод", "Бишкек", "Бухоро", "Денов", "Жалолобод", "Жамбул", "Жиззах", "Жомбой", "Каттақўрғон", "Марғилон", "Навоий", "Наманган", "Нукус", "Нурота", "Самарқанд", "Туркистон", "Ўш", "Хива", "Хўжанд", "Чимкент", "Қарши", "Қўқон", "Тошкент", "Шаҳрихон", "Хўжаобод", "Қўрғонтепа", "Хонобод", "Поп", "Чуст", "Косонсой", "Чортоқ", "Учқўрғон", "Фарғона", "Олтиариқ", "Риштон", "Қува", "Олмаота", "Сайрам", "Ангрен", "Бурчмулла", "Олот", "Газли", "Қоровулбозор", "Қоракўл", "Пахтаобод", "Зомин", "Дўстлик", "Арнасой", "Ўсмат", "Ғаллаорол", "Учтепа", "Ўғиз", "Томди", "Конимех", "Қизилтепа", "Зарафшон", "Узунқудуқ", "Учқудуқ", "Мингбулоқ", "Тахтакўпир", "Чимбой", "Мўйноқ", "Олтинкўл", "Шуманай", "Қўнғирот", "Булоқбоши", "Термиз", "Қумқўрғон", "Бойсун", "Шеробод", "Урганч", "Хазорасп", "Хонқа", "Янгибозор", "Шовот", "Деҳқонобод", "Ғузор", "Косон", "Таллимаржон", "Муборак", "Душанбе", "Ашхабод", "Туркманобод", "Тошҳовуз", "Қарши", "Навои"};
    public static final String START_COMMAND = "/start";
    public static final String RUNNING_MESSAGE = "Working...";
    public static final String START_MESSAGE = "*NAMOZ VAQTI* телеграм ботига хуш келибсиз.\nЎзингизга яқин туман тугмасини босинг ва мен сизга бугунги намоз вақтларини билиб бераман.";
    public static final String FOOTER_MESSAGE = "*" + BOT_USERNAME + " манба islom.uz сайти.*";
}
