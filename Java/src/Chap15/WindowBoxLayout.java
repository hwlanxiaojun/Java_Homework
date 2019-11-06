package Chap15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author Lan XiaoJun
 * @Date 2019/11/3 18:37
 * @Version 1.0
 **/
public class WindowBoxLayout extends JFrame {
    Box boxOne,boxTwo;   //行式盒
    Box boxV;           //列式盒
    public WindowBoxLayout(){
        setLayout(new FlowLayout());
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    void init(){
        boxOne = Box.createHorizontalBox();
        boxTwo = Box.createHorizontalBox();
        boxV = Box.createVerticalBox();
        JTextField numOne = new JTextField(10);
        JTextField numTwo = new JTextField(10);
        JTextField result = new JTextField(10);
        JButton add = new JButton("Add");
        JButton sub = new JButton("Subtract");
        JButton mul = new JButton("Multiply");
        JButton div = new JButton("Divide");
        boxOne.add(new JLabel("Number 1:"));
        boxOne.add(numOne);
        boxOne.add(new JLabel("Number 2:"));
        boxOne.add(numTwo);
        boxOne.add(new JLabel("Result:"));
        boxOne.add(result);
        boxTwo.add(add);
        boxTwo.add(sub);
        boxTwo.add(mul);
        boxTwo.add(div);
        boxV.add(boxOne);
        boxV.add(Box.createVerticalStrut(10));
        boxV.add(boxTwo);
        add(boxV);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double num1= Double.parseDouble(numOne.getText().trim());
                    double num2= Double.parseDouble(numTwo.getText().trim());
                    result.setText(num1+num2+"");
                }
                catch (Exception ex)
                {
                    numOne.setText("");
                    numTwo.setText("");
                }
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1= Double.parseDouble(numOne.getText().trim());
                    double num2= Double.parseDouble(numTwo.getText().trim());
                    result.setText(num1-num2+"");
                }
                catch (Exception ex)
                {
                    numOne.setText("");
                    numTwo.setText("");
                }
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1= Double.parseDouble(numOne.getText().trim());
                    double num2= Double.parseDouble(numTwo.getText().trim());
                    result.setText(num1*num2+"");
                }
                catch (Exception ex)
                {
                    numOne.setText("");
                    numTwo.setText("");
                }
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1= Double.parseDouble(numOne.getText().trim());
                    double num2= Double.parseDouble(numTwo.getText().trim());
                    result.setText(num1/num2+"");
                }
                catch (Exception ex)
                {
                    numOne.setText("");
                    numTwo.setText("");
                }
            }
        });
    }
}
