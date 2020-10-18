package cn.bravedawn.design.pattern.creational.singleton.container;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 容器单例
 * @date : Created in 2020/10/18 10:08
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    // map就是容器
    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    public static void putInstance(String key, Object instance){
        if (StringUtils.isNoneBlank(key) && instance != null){
            singletonMap.put(key, instance);  // 这里存在线程不安全的问题
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
