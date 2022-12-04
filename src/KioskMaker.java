import data.*;
import panels.*;
import java.awt.*;
import java.io.File;
import javax.swing.*;

//프로젝트 설계도 제안안
public class KioskMaker extends JFrame{
    private JPanel north, menu, order, category;

    public KioskMaker() {
        setTitle("주문 시스템");

        Container c = getContentPane();
        c.setLayout(null);

        Panels.init();
        //각 패널들의 클래스 객체 생성
        north = Panels.getNorthPanel();
        menu = Panels.getMenuPanel();
        category = Panels.getCategoryPanel();
        order = Panels.getOrderPanel();

        //패널들 위치지정
        north.setSize(350,40);
        north.setLocation(0,0);
        category.setSize(350, 50);
        category.setLocation(0,35);
        menu.setSize(350, 350);
        menu.setLocation(0, 85);        
        order.setSize(350, 350);
        order.setLocation(0,440);


        c.add(menu);
        c.add(category);
        c.add(north);
        c.add(order);
        
        setSize(365,780);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //추가 22.12.04
    }

    public static void main(String[] args) {
        File file = new File("Gimbap.txt");
        Data.setData(file);
        new KioskMaker();
    }
}