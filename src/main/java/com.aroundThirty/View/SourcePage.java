package com.aroundThirty.View;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.FR.*;

public class SourcePage extends JFrame {
    JPanel centerPan;
    JPanel sourceOnePan;
    JPanel sourceTwoPan;
    JPanel sourceThreePan;
    JPanel sourceFourPan;
    JPanel sourceFivePan;
    JPanel subjectPan01;
    JPanel subjectPan02;
    JPanel emptyPan;
    JPanel sourceSixPan;
    JPanel sourceSevenPan;

    JLabel sourceOneLabel;
    JLabel sourceTwoLabel;
    JLabel sourceThreeLabel;
    JLabel sourceFourLabel;
    JLabel sourceFiveLabel;
    JLabel subjectLabel;
    JLabel gitHubLabel;
    JLabel sourceSixLabel;
    JLabel sourceSevenLabel;


    public SourcePage() {
        setSize(540, 360);
        setResizable(false);

        subjectLabel = new JLabel("출 처");
        subjectLabel.setFont(fontNanumBold);
        sourceOneLabel = new JLabel("https://www.data.go.kr/");
        sourceOneLabel.setFont(fontNanum);
        sourceTwoLabel = new JLabel("https://www.animal.go.kr/front/index.do");
        sourceTwoLabel.setFont(fontNanum);
        sourceThreeLabel = new JLabel("https://docs.oracle.com/javase/tutorial/");
        sourceThreeLabel.setFont(fontNanum);
        sourceFourLabel = new JLabel("https://mariadb.com/kb/en/mariadb-string-functions/");
        sourceFourLabel.setFont(fontNanum);
        sourceFiveLabel = new JLabel("https://dogmaru.co.kr/");
        sourceFiveLabel.setFont(fontNanum);
        sourceSevenLabel = new JLabel("https://colab.research.google.com/drive/");
        sourceSevenLabel.setFont(fontNanum);
        gitHubLabel = new JLabel("'서른즈음에' 깃허브");
        gitHubLabel.setFont(fontNanumBold);
        sourceSixLabel = new JLabel("https://github.com/Dev-SHK/KDT-TeamProject-AroundThirty-Maven.git");
        sourceSixLabel.setFont(fontNanum);

        subjectPan01 = new JPanel();
        subjectPan01.add(subjectLabel);
        subjectPan01.setBackground(pastelGreen);

        sourceOnePan = new JPanel();
        sourceOnePan.add(sourceOneLabel);
        sourceOnePan.setBackground(pastelGreen);

        sourceTwoPan = new JPanel();
        sourceTwoPan.add(sourceTwoLabel);
        sourceTwoPan.setBackground(pastelGreen);

        sourceThreePan = new JPanel();
        sourceThreePan.add(sourceThreeLabel);
        sourceThreePan.setBackground(pastelGreen);

        sourceFourPan = new JPanel();
        sourceFourPan.add(sourceFourLabel);
        sourceFourPan.setBackground(pastelGreen);

        sourceFivePan = new JPanel();
        sourceFivePan.add(sourceFiveLabel);
        sourceFivePan.setBackground(pastelGreen);

        sourceSevenPan = new JPanel();
        sourceSevenPan.add(sourceSevenLabel);
        sourceSevenPan.setBackground(pastelGreen);

        emptyPan = new JPanel();
        emptyPan.setBackground(pastelGreen);

        subjectPan02 = new JPanel();
        subjectPan02.add(gitHubLabel);
        subjectPan02.setBackground(pastelGreen);

        sourceSixPan = new JPanel();
        sourceSixPan.add(sourceSixLabel);
        sourceSixPan.setBackground(pastelGreen);

        JPanel gridPan = new JPanel(new GridLayout(10, 1));
        gridPan.add(subjectPan01);
        gridPan.add(sourceOnePan);
        gridPan.add(sourceTwoPan);
        gridPan.add(sourceThreePan);
        gridPan.add(sourceFourPan);
        gridPan.add(sourceFivePan);
        gridPan.add(sourceSevenPan);
        gridPan.add(emptyPan);
        gridPan.add(subjectPan02);
        gridPan.add(sourceSixPan);
        gridPan.setBackground(pastelGreen);

        centerPan = new JPanel();
        centerPan.add(gridPan);
        centerPan.setBackground(pastelGreen);

        setBackground(pastelGreen);
        add(BorderLayout.CENTER, centerPan);
        setVisible(true);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();

        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
    }

}
