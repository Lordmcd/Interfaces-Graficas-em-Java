package view;

import javax.swing.*;
import java.awt.Container;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class PrimeiraTela extends JFrame{
    private JLabel lblNome;
    private JTextField txtNome;
    private JLabel lblCPF;
    private JFormattedTextField txtCPF;
    private JLabel lblTipo;
    private JComboBox cmbTipo;
    private final String[] tiposUsuarios = {"Administrador", "Geral"};
    private JButton btnOK;
    private Container ctn;


    public PrimeiraTela(){
        setSize(400,300);
        setTitle("Tela inicial");
        ctn = getContentPane();
        lblNome = new JLabel("Nome");
        txtNome = new JTextField();
        lblCPF = new JLabel("CPF");
        try {
            txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        } catch (ParseException e){
            e.printStackTrace();
        }

        lblTipo = new JLabel("Tipo de usuários");
        cmbTipo = new JComboBox(tiposUsuarios);
        btnOK = new JButton("Enviar");
        ctn.setLayout(null);
        lblNome.setBounds(10,0,100,25);
        txtNome.setBounds(150,0,200,25);
        lblCPF.setBounds(10,50,100,25);
        txtCPF.setBounds(150,50,200,25);
        lblTipo.setBounds(10,100,200,25);
        cmbTipo.setBounds(150,100,200,25);
        btnOK.setBounds(150,150,100,100);
        ctn.add(lblNome);
        ctn.add(txtNome);
        ctn.add(lblCPF);
        ctn.add(txtCPF);
        ctn.add(lblTipo);
        ctn.add(cmbTipo);
        ctn.add(btnOK);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        PrimeiraTela t1 = new PrimeiraTela();
    }
}
