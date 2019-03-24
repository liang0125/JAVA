package collection;

import java.util.*;

/**
 * Author:lorrie
 * Create:2019/3/22
 */
public class TestArrayList {
    public static void main(String[] args) {

        //List接口
//        List<String > list=new ArrayList<String>();
//        list.add("hello");
//        //重复元素
//        list.add("hello");
//        list.add("Java");
//        System.out.println("集合大小为："+list.size()+" 集合是否为空："+list.isEmpty());
//        for (int i=0;i<list.size();i++){
//            //get()方法
//            System.out.println(list.get(i));
//        }
//        System.out.println("删除hello后");
//        list.remove("hello");
//        System.out.println("集合大小为："+list.size()+" 集合是否为空："+list.isEmpty());
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println(list.contains("hello"));
//        System.out.println(list.contains("ABC"));
//        System.out.println(list);


        //Collection接口
//        Collection<String > list=new ArrayList<String>();
//        list.add("hello");
//        list.add("hello");
//        list.add("Java");
//        // 操作以Object为主，有可能需要向下转型，就有可能产生ClassCastException
//        Object[] objects=list.toArray();
//        System.out.println(Arrays.toString(objects));


//        List<String > list=new Vector<String>();
//        list.add("hello");
//        list.add("hello");
//        list.add("Java");
////        System.out.println(list);
//        Iterator<String> iterator=list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


//        Set<String> set=new HashSet<String>();
//        set.add("hello");
//        set.add("hello");
//        set.add("Java");
//        System.out.println(set);


//        Set<Integer> set=new TreeSet<Integer>();
//        set.add(1);
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        System.out.println(set);


//        Map<Integer,String> map=new HashMap<Integer, String>();
//        map.put(1,"hello");
//        map.put(1,"hello");
//        map.put(2,"Java");
//        map.put(3,"is");
//        map.put(4,"best");
//        map.put(null,"!!!");
//        map.put(null,"...");
//        map.put(5,null);
//        map.put(6,null);
//        System.out.println(map);
//        System.out.println(map.get(1));
//        System.out.println(map.get(10));


//        Map<Integer,String > map=new Hashtable<Integer, String>();
//        map.put(1,"hello");
//        map.put(1,"hello");
//        map.put(2,"Java");
//        map.put(3,"is");
//        map.put(4,"best");
//        map.put(null,"!!!");
//        map.put(null,"...");
//        map.put(5,null);
//        map.put(6,null);
//        System.out.println(map.get(1));
//        System.out.println(map.get(10));


        Map<Integer,String> map=new TreeMap<Integer, String>();
        map.put(2,"is");
        map.put(1,"Java");
        map.put(3,"best");
        map.put(0,"hello");
        System.out.println(map);
    }
}
