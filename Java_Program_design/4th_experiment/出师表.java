/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-25 18:32:57
 * @LastEditTime: 2019-03-25 18:33:33
 */
public class 君 {
    public enum 王道 {
        明, 昏
    };

    public boolean 在;
    public 王道 为君;

    public 君() {
        在 = true;
        为君 = 王道.明;
    }

    public boolean 创业(double percentage) {
        if (percentage < 0.5) {
            在 = false;
            System.out.println("中道崩殂！");
            return false;
        } else {
            System.out.println("兴复汉室，还于旧都！");
            return true;
        }
    }

    public void 开张圣听() {
        System.out.println("光先帝遗德！");
    }

    public void 恢弘志士之气() {
    }

    public void 妄自菲薄() {
    }

    public void 引喻失义() {
        System.out.println("塞忠谏之路！");
    }

    public void 亲贤臣远小人() {
        为君 = 王道.明;
    }

    public void 亲小人远贤臣() {
        为君 = 王道.昏;
    }

    public void 治国() {
    }

    public void 偏私() {
        System.out.println("内外异法！");
    };

    public boolean 咨之() {
        if (为君 == 王道.明)
            return true;
        else
            return false;
    }

    public boolean 施行() {
        return true;
    }

    public void 曰() {
        System.out.println("言");
    }

    public void 每与臣论此事() {
        System.out.println("叹息痛恨于柩灵。");
    }
}

public class 国 {
    侍卫之臣 s = new 侍卫之臣();

    public enum 气候 {
        兴盛, 疲敝, 兴隆, 倾颓
    };

    public 气候 国运;

    public 国() {
        国运 = 气候.兴盛;
    }

    public void 付诸有司论其刑赏(侍卫之臣 臣) {
        if (臣.为臣 == s.为臣.贤)
            System.out.println("赏！");
        else
            System.out.println("刑！");
    }
}

public class 侍卫之臣 {
    君 j = new 君();

    public enum 臣德 {
        贤, 奸
    }

    private 君 刘备;
    private 君 刘禅;
    public 臣德 为臣;

    public void 不懈于内() {
        System.out.println("不懈于内！");
    }

    public boolean 追先帝之殊遇() {
        return true;
    }

    public boolean 报之于陛下() {
        return true;
    }

    public boolean 谋事() {
        return true;
    }
}

public class 忠烈之士 {
    君 j = new 君();

    public enum 臣德 {
        贤, 奸
    };

    private 君 刘备;
    private 君 刘禅;
    public 臣德 为臣;

    public void 忘身于外() {
        System.out.println("忘身于外！");
    };

    public boolean 追先帝之殊遇() {
        return true;
    }

    public boolean 报之于陛下() {
        return true;
    }

    public boolean 谋事() {
        return true;
    }
}

public class 诸葛亮 extends 侍卫之臣 {
    public void 回首往事() {
        System.out.println(
                "臣本布衣，躬耕于南阳，苟全性命于乱世，不求闻达于诸侯。先帝不以臣卑鄙，猥自枉屈，三顾臣于草庐之中，咨臣以当世之事，由是感激，遂许先帝以驱驰。\n后值倾覆，受任于败军之际，奉命于危难之间，尔来二十有一年矣。");
    }

    public void 表忠心() {
        System.out.println("先帝知臣谨慎，故临崩寄臣以大事也。受命以来，夙夜忧叹，恐托付不效，以伤先帝之明。故五月渡泸，深入不毛。");
    }

    public void 请战() {
        System.out.println("今南方已定，兵甲已足，当奖率三军，北定中原，庶竭驽钝，攘除奸凶，兴复汉室，还于旧都。");
    }

    public void 道别() {
        System.out.println("今当远离，临表涕零，不知所言。");
    }
}

public class 侍郎 extends 侍卫之臣 {
}

public class 侍中 extends 侍卫之臣 {
}

public class 都督 extends 忠烈之士 {
}

public class Main {
    public static void main(String[] args) {
        君 先帝 = new 君();
        君 陛下 = new 君();
        君 文景 = new 君();
        君 柩灵 = new 君();
        国 曹魏 = new 国();
        国 东吴 = new 国();
        国 益州 = new 国();
        国 先汉 = new 国();
        国 后汉 = new 国();
        侍中 郭攸之 = new 侍中();
        侍中 费祎 = new 侍中();
        侍郎 董允 = new 侍郎();
        都督 向宠 = new 都督();
        先帝.创业(0.49);
        益州.国运 = 益州.国运.疲敝;
        System.out.println("此诚危急存亡之秋也！");
        if (郭攸之.追先帝之殊遇() && 郭攸之.报之于陛下()) {
            郭攸之.不懈于内();
        }
        if (费祎.追先帝之殊遇() && 费祎.报之于陛下()) {
            费祎.不懈于内();
        }
        if (董允.追先帝之殊遇() && 董允.报之于陛下()) {
            董允.不懈于内();
        }
        if (向宠.追先帝之殊遇() && 向宠.报之于陛下()) {
            向宠.忘身于外();
        }
        if (陛下.为君 == 陛下.为君.明) {
            陛下.开张圣听();
            陛下.恢弘志士之气();
        } else {
            陛下.妄自菲薄();
            陛下.引喻失义();
        }
        陛下.治国();
        boolean 宫中 = false;
        boolean 府中 = false;
        boolean 陟罚 = false;
        boolean 臧否 = false;
        assert (宫中 == 府中);
        assert (陟罚 == 臧否);
        侍卫之臣 作奸犯科者 = new 侍卫之臣();
        作奸犯科者.为臣 = 作奸犯科者.为臣.奸;
        侍卫之臣 为忠善者 = new 侍卫之臣();
        为忠善者.为臣 = 为忠善者.为臣.贤;
        陛下.为君 = 陛下.为君.明;
        if (陛下.为君 == 陛下.为君.明) {
            益州.付诸有司论其刑赏(作奸犯科者);
            益州.付诸有司论其刑赏(为忠善者);
        } else
            陛下.偏私();
        郭攸之.为臣 = 郭攸之.为臣.贤;
        费祎.为臣 = 费祎.为臣.贤;
        董允.为臣 = 董允.为臣.贤;
        if (郭攸之.为臣 == 郭攸之.为臣.贤 && 费祎.为臣 == 费祎.为臣.贤 && 董允.为臣 == 董允.为臣.贤)
            System.out.println("此皆良实，志虑忠纯，是以先帝简拔以遗陛下。");
        if (陛下.咨之() && 郭攸之.谋事() && 费祎.谋事() && 董允.谋事()) {
            陛下.施行();
            System.out.println("裨补缺漏，有所广益！");
        }
        向宠.为臣 = 向宠.为臣.贤;
        if (向宠.为臣 == 向宠.为臣.贤) {
            System.out.println("性行淑均，晓畅军事。");
            System.out.println("先帝称之曰：");
            System.out.println("能");
            System.out.println("是以众意举宠为督。");
        }
        if (陛下.咨之()) {
            陛下.施行();
            System.out.println("行阵和睦，优劣得所！");
        }
        文景.亲贤臣远小人();
        先汉.国运 = 先汉.国运.兴隆;
        柩灵.亲小人远贤臣();
        后汉.国运 = 后汉.国运.倾颓;
        do {
            先帝.每与臣论此事();
        } while (先帝.在);
        if (郭攸之.为臣 == 郭攸之.为臣.贤 && 费祎.为臣 == 费祎.为臣.贤 && 董允.为臣 == 董允.为臣.贤) {
            System.out.println("此悉贞良死结之臣，愿陛下亲之信之，则汉室之隆，可计日而待也。");
        }
        诸葛亮 z = new 诸葛亮();
        z.回首往事();
        z.表忠心();
        z.请战();
        z.道别();
    }
}
