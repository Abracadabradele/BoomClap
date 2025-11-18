import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class JavaGUIPianoJFrame extends JFrame implements ActionListener{
    private JTextField filePathField;
    private JButton cKeyButton;
    private JButton dKeyButton;
    private JButton eKeyButton;
    private JButton fKeyButton;
    private JButton gKeyButton;
    private JButton aKeyButton;
    private JButton c2KeyButton;
    private JButton cSKeyButton;
    private JButton dSKeyButton;
    private JButton fSKeyButton;
    private JButton gSKeyButton;
    private JButton aSKeyButton;
    private JFileChooser fileChooser;
    private Clip c;
    private Clip d;
    private Clip e;
    private Clip f;
    private Clip g;
    private Clip a;
    private Clip c2;
    private Clip cs;
    private Clip ds;
    private Clip gs;
    private Clip fs;
    private Clip as;

    public JavaGUIPianoJFrame(){
        super("Piano");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        filePathField = new JTextField(20);
        cKeyButton = new JButton("c");
        dKeyButton = new JButton("d");
        eKeyButton = new JButton("e");
        fKeyButton = new JButton("f");
        gKeyButton = new JButton("g");
        aKeyButton = new JButton("a");
        c2KeyButton = new JButton("c");
        cSKeyButton = new JButton("C#");
        dSKeyButton = new JButton("d#");
        fSKeyButton = new JButton("f#");
        gSKeyButton = new JButton("g#");
        aSKeyButton = new JButton("a#");

        cKeyButton.addActionListener(this);
        dKeyButton.addActionListener(this);
        eKeyButton.addActionListener(this);
        fKeyButton.addActionListener(this);
        gKeyButton.addActionListener(this);
        aKeyButton.addActionListener(this);
        c2KeyButton.addActionListener(this);
        cSKeyButton.addActionListener(this);
        dSKeyButton.addActionListener(this);
        fSKeyButton.addActionListener(this);
        gSKeyButton.addActionListener(this);
        aSKeyButton.addActionListener(this);

        add(filePathField);
        add(cKeyButton);
        add(dKeyButton);
        add(eKeyButton);
        add(fKeyButton);
        add(gKeyButton);
        add(aKeyButton);
        add(c2KeyButton);
        add(cSKeyButton);
        add(dSKeyButton);
        add(fSKeyButton);
        add(gSKeyButton);
        add(aSKeyButton);

        fileChooser = new JFileChooser(".");
        fileChooser.setFileFilter(new FileNameExtensionFilter("WAV Files", "Wav"));

        setSize(1000,200);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    @Override 
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == cKeyButton){
            playcKey()
        }

    }


}
