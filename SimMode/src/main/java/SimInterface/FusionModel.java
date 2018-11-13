package SimInterface;

public class FusionModel {
    public static String fusionMdodel(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append("模型处理成功，数据为:/*  ");
        sb.append(s);
        sb.append("   */\n");
        return sb.toString();

    }
}
