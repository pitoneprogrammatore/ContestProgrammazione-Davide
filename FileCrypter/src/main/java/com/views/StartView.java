package com.views;import java.awt.EventQueue;import javax.swing.JFrame;import javax.swing.JLabel;import javax.swing.JOptionPane;
import javax.swing.JPanel;import javax.swing.border.EmptyBorder;import com.utils.FileCipherHelper;import javax.swing.ImageIcon;import javax.swing.JButton;
import java.awt.event.ActionListener;import java.awt.event.ActionEvent;import javax.swing.JFileChooser;import java.awt.Color;
public class StartView extends JFrame {
	private String inputPath, outputPathEncrypted,outputPathDecrypted,nameFile;private static StartView frame;private final String pwd = "grofjirvnr.locjr";
	private static final long serialVersionUID = 1L;private JPanel contentPane;public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {public void run() {try {frame = new StartView();frame.setVisible(true);} catch (Exception e) {
			e.printStackTrace();}}});}
	public StartView() {setTitle("FILE_CRYPT");setResizable(false);setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);setBounds(100, 100, 815, 485);contentPane = new JPanel();
	contentPane.setBackground(new Color(51, 102, 153));contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));setContentPane(contentPane);contentPane.setLayout(null);
	JLabel lblIn = new JLabel("");lblIn.setForeground(Color.WHITE);lblIn.setBounds(328, 74, 473, 32);contentPane.add(lblIn);
	JLabel lblOut = new JLabel("");lblOut.setForeground(Color.WHITE);lblOut.setBounds(328, 118, 473, 32);contentPane.add(lblOut);JButton btnSalvaIlTesto = new JButton("FileIn");
	btnSalvaIlTesto.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {try {JFileChooser f = new JFileChooser();f.setFileSelectionMode(JFileChooser.FILES_ONLY);
	f.showSaveDialog(null);inputPath = f.getSelectedFile().toString();nameFile = f.getSelectedFile().getName();lblIn.setText(f.getSelectedFile().toString());
	}catch(Exception e1) {}}});btnSalvaIlTesto.setBounds(138, 289, 148, 32);contentPane.add(btnSalvaIlTesto);JButton btnLeggiIlTesto = new JButton("FileOut");
	btnLeggiIlTesto.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {try {JFileChooser f = new JFileChooser();
	f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);f.showSaveDialog(null);outputPathEncrypted = f.getSelectedFile().toString() + "/" + nameFile + ".encrypted";
	outputPathDecrypted = f.getSelectedFile().toString() + "/" + nameFile + ".decrypted";lblOut.setText(f.getSelectedFile().toString() + "/" + nameFile + ".decrypted");} catch (Exception e2) {
	}}});btnLeggiIlTesto.setBounds(138, 351, 148, 32);contentPane.add(btnLeggiIlTesto);JButton btnCriptafile = new JButton("CriptaFile");
	btnCriptafile.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		try {FileCipherHelper.encryptedFile(pwd, inputPath, outputPathEncrypted);JOptionPane.showMessageDialog(frame, "Criptazione file eseguita con successo");
		} catch (Exception e1) {JOptionPane.showMessageDialog(frame, "Inserire le destinazioni per tutti e due i file");}}});btnCriptafile.setBounds(549, 289, 148, 32);contentPane.add(btnCriptafile);
		JButton btnDecriptafile = new JButton("DecriptaFile");btnDecriptafile.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			try{FileCipherHelper.decryptedFile(pwd, inputPath, outputPathDecrypted);JOptionPane.showMessageDialog(frame, "Decriptazione file eseguita con successo");
			}catch (Exception e1) {JOptionPane.showMessageDialog(frame, "Inserire le destinazioni per tutti e due i file");}}});btnDecriptafile.setBounds(549, 351, 148, 32);contentPane.add(btnDecriptafile);
			JLabel lblSfondo = new JLabel(new ImageIcon(getClass().getResource("/Img/key.png")));lblSfondo.setBounds(0, 26, 260, 215);contentPane.add(lblSfondo);
			JLabel lblNewLabel_1 = new JLabel("FileCrypt by JavaSolaris");lblNewLabel_1.setForeground(Color.WHITE);lblNewLabel_1.setBounds(338, 407, 174, 25);contentPane.add(lblNewLabel_1);
			JLabel lblFileIn = new JLabel("FILE IN:");lblFileIn.setForeground(Color.WHITE);lblFileIn.setBackground(Color.WHITE);lblFileIn.setBounds(254, 80, 70, 15);
			contentPane.add(lblFileIn);JLabel lblFileOut = new JLabel("FILE OUT:");lblFileOut.setForeground(Color.WHITE);lblFileOut.setBackground(Color.WHITE);lblFileOut.setBounds(254, 129, 70, 15);
			contentPane.add(lblFileOut);}}
