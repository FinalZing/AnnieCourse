package myannie.com.anniecourse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weihuajian on 16/6/12.
 */
public class CourseDao {

    public static List<CourseModel>[] getCourseData() {

        List<CourseModel> courseModels[] = new ArrayList[7];

        for (int i = 0; i < courseModels.length; i++) {
            courseModels[i] = new ArrayList<>();
        }

        List<CourseModel> models_1 = new ArrayList<>();
        models_1.add(new CourseModel(0, "外贸英语函电", 1, 3, 1, "一教1302", (int) (Math.random() * 10),"莫婉妮"));
        models_1.add(new CourseModel(1, "国贸综合实训", 4, 2, 1, "阶梯二", (int) (Math.random() * 10),"朱振东"));
        courseModels[0].addAll(models_1);

        List<CourseModel> models_2 = new ArrayList<>();
        models_2.add(new CourseModel(2, "电子商务行业英语", 1, 3, 2, "一教1601", (int) (Math.random() * 10),"周金龙"));
        models_2.add(new CourseModel(3, "国际商务谈判", 4, 2, 2, "一教1602", (int) (Math.random() * 10),"林竞"));
        models_2.add(new CourseModel(10, "瑜伽", 10, 2, 2, "20：30-21：30", (int) (Math.random() * 10),"罗老师"));
        courseModels[1].addAll(models_2);

        List<CourseModel> models_3 = new ArrayList<>();
        courseModels[2].addAll(models_3);
        models_3.add(new CourseModel(11, "爵士", 5, 1, 3, "12：30-13：30", (int) (Math.random() * 10),"俏婷"));
        models_3.add(new CourseModel(12, "瑜伽", 9, 1, 3, "19：30-20：30", (int) (Math.random() * 10),"罗老师"));
        models_3.add(new CourseModel(13, "拉丁", 10, 2, 2, "20：30-21：30", (int) (Math.random() * 10),"思欢"));

        List<CourseModel> models_4 = new ArrayList<>();
        models_4.add(new CourseModel(3, "国际商务谈判", 4, 2, 4, "一教1602", (int) (Math.random() * 10),"林竞"));
        models_4.add(new CourseModel(6, "东南亚经济与贸易", 6, 4, 4, "一教1410", (int) (Math.random() * 10),"唐曼兰"));
        models_4.add(new CourseModel(14, "breaking、waacking、poping", 9, 3, 2, "19:00-21：30", (int) (Math.random() * 10),"罗老师"));
        courseModels[3].addAll(models_4);

        List<CourseModel> models_5 = new ArrayList<>();
        models_5.add(new CourseModel(7, "跨境电商", 3, 3, 5, "一教1309", (int) (Math.random() * 10),"蒋和平"));
        models_5.add(new CourseModel(15, "拉丁", 10, 2, 5, "20:30", (int) (Math.random() * 10),"思欢"));
        courseModels[4].addAll(models_5);

        List<CourseModel> models_6 = new ArrayList<>();
        models_6.add(new CourseModel(16, "拉丁", 7, 2, 6, "15：30-16：30", (int) (Math.random() * 10),"思欢"));
        courseModels[5].addAll(models_6);

        List<CourseModel> models_7 = new ArrayList<>();
        models_7.add(new CourseModel(17, "瑜伽", 9, 2, 7, "19：00-20：00", (int) (Math.random() * 10),"罗老师"));
        courseModels[6].addAll(models_7);

        return courseModels;

    }
}
