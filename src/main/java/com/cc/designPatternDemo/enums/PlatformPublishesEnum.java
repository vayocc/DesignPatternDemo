package com.cc.designPatternDemo.enums;

import com.cc.designPatternDemo.sercice.PlatformStrategyService;
import com.cc.designPatternDemo.sercice.impl.DouYinPlatformServiceImpl;
import com.cc.designPatternDemo.sercice.impl.JDPlatformServiceImpl;
import com.cc.designPatternDemo.sercice.impl.PDDPlatformServiceImpl;
import com.cc.designPatternDemo.sercice.impl.TaobaoPlatformServiceImpl;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum PlatformPublishesEnum {

    TAOBAO("tb", TaobaoPlatformServiceImpl.class),
    JD("jd", JDPlatformServiceImpl.class),
    PDD("pdd", PDDPlatformServiceImpl.class),
    DOUYIN("dy", DouYinPlatformServiceImpl.class),
    ;


    private String type;
    private Class<? extends PlatformStrategyService> strategyClass;

    PlatformPublishesEnum(String type, Class<? extends PlatformStrategyService> strategyClass) {
        this.type = type;
        this.strategyClass = strategyClass;
    }

    /**
     * 通过类型名称获取实例对象
     *
     * @param typeName
     * @return
     */
    public static PlatformStrategyService getStrategyInstance(String typeName) {
        for (PlatformPublishesEnum value : PlatformPublishesEnum.values()) {
            if (value.getType().equals(typeName)) {
                try {
                    Class<? extends PlatformStrategyService> strategyClass = value.getStrategyClass();
                    return strategyClass.getDeclaredConstructor().newInstance();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        }
        return null;
    }
    /**
     * 获取全部的转换功能
     * @return
     */
    public static List<String> getTypeList(){
        List<String> typeNameList = new ArrayList<>();
        for (PlatformPublishesEnum value : PlatformPublishesEnum.values()) {
            typeNameList.add(value.getType());
        }
        return typeNameList;
    }

}
