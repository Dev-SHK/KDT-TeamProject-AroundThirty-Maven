package com.aroundThirty.View;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class IntroducePage extends JFrame {
    JPanel centerPan;
    JPanel personOnePan;
    JPanel personTwoPan;
    JPanel personThreePan;
    JPanel personFourPan;
    JPanel personFivePan;
    JPanel subjectPan01;
    JPanel subjectPan02;
    JPanel emptyPan;
    JPanel personSixPan;
    JPanel personSevenPan;
    JPanel personEightPan;
    JPanel personNinePan;

    JLabel personOneLabel;
    JLabel personTwoLabel;
    JLabel personThreeLabel;
    JLabel personFourLabel;
    JLabel personFiveLabel;
    JLabel subjectLabel;
    JLabel thankstoLabel;
    JLabel personSixLabel;
    JLabel personSevenLabel;
    JLabel personEightLabel;
    JLabel personNineLabel;


    public IntroducePage() {
        setSize(240, 400);
        setResizable(false);

        subjectLabel = new JLabel("만든 이");
        subjectLabel.setFont(fontNanumBold);
        personOneLabel = new JLabel("말년 전경진");
        personOneLabel.setFont(fontNanum);
        personTwoLabel = new JLabel("분대장 김승화");
        personTwoLabel.setFont(fontNanum);
        personThreeLabel = new JLabel("상병 김민수");
        personThreeLabel.setFont(fontNanum);
        personFourLabel = new JLabel("일병 김영준");
        personFourLabel.setFont(fontNanum);
        personFiveLabel = new JLabel("이병 김진솔");
        personFiveLabel.setFont(fontNanum);
        thankstoLabel = new JLabel("Special Thanks To");
        thankstoLabel.setFont(fontNanumBold);
        personSixLabel = new JLabel("김범준 대대장님");
        personSixLabel.setFont(fontNanum);
        personSevenLabel = new JLabel("구글러 유진킴");
        personSevenLabel.setFont(fontNanum);
        personEightLabel = new JLabel("경진형님의 사랑스런 첫째딸 소예");
        personEightLabel.setFont(fontNanum);
        personNineLabel = new JLabel("경진형님의 사랑스런 둘째딸 윤슬");
        personNineLabel.setFont(fontNanum);

        subjectPan01 = new JPanel();
        subjectPan01.add(subjectLabel);
        subjectPan01.setBackground(pastelPink);

        personOnePan = new JPanel();
        personOnePan.add(personOneLabel);
        personOnePan.setBackground(pastelPink);

        personTwoPan = new JPanel();
        personTwoPan.add(personTwoLabel);
        personTwoPan.setBackground(pastelPink);

        personThreePan = new JPanel();
        personThreePan.add(personThreeLabel);
        personThreePan.setBackground(pastelPink);

        personFourPan = new JPanel();
        personFourPan.add(personFourLabel);
        personFourPan.setBackground(pastelPink);

        personFivePan = new JPanel();
        personFivePan.add(personFiveLabel);
        personFivePan.setBackground(pastelPink);

        emptyPan = new JPanel();
        emptyPan.setBackground(pastelPink);

        subjectPan02 = new JPanel();
        subjectPan02.add(thankstoLabel);
        subjectPan02.setBackground(pastelPink);

        personSixPan = new JPanel();
        personSixPan.add(personSixLabel);
        personSixPan.setBackground(pastelPink);

        personSevenPan = new JPanel();
        personSevenPan.add(personSevenLabel);
        personSevenPan.setBackground(pastelPink);

        personEightPan = new JPanel();
        personEightPan.add(personEightLabel);
        personEightPan.setBackground(pastelPink);

        personNinePan = new JPanel();
        personNinePan.add(personNineLabel);
        personNinePan.setBackground(pastelPink);

        JPanel gridPan = new JPanel(new GridLayout(12, 1));
        gridPan.add(subjectPan01);
        gridPan.add(personOnePan);
        gridPan.add(personTwoPan);
        gridPan.add(personThreePan);
        gridPan.add(personFourPan);
        gridPan.add(personFivePan);
        gridPan.add(emptyPan);
        gridPan.add(subjectPan02);
        gridPan.add(personSixPan);
        gridPan.add(personSevenPan);
        gridPan.add(personEightPan);
        gridPan.add(personNinePan);
        gridPan.setBackground(pastelPink);

        centerPan = new JPanel();
        centerPan.add(gridPan);
        centerPan.setBackground(pastelPink);

        setBackground(pastelPink);
        add(BorderLayout.CENTER, centerPan);
        setVisible(true);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();

        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
    }

}
