package view;

import javax.swing.*;
import java.awt.Container;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class SegundaTela extends JFrame{
    private JLabel lblNome;
    private JTextField txtNome;
    private JLabel lblEndereco;
    private JTextField txtEndereco;
    private JLabel lblTelefone;
    private JFormattedTextField txtTelefone;
    private JLabel lblCPF;
    private JFormattedTextField txtCPF;
    private JLabel lblSangue;
    private JComboBox cmbSangue;
    private final String[] tiposSangue = {"A", "B", "AB", "O"};
    private JLabel lblFator;
    private JComboBox cmbFator;
    private final String[] tiposFator = {"+", "-"};

    private JLabel lblCurso;
    private JComboBox cmbCurso;
    private final String[] tiposCurso = {"Ciência da computação", "Administração", "Engenharia"};
    private JLabel lblEmergencia;
    private JTextField txtEmergencia;
    private JButton btnInserir;
    private JButton btnCancelar;
    private Container ctn;

    public SegundaTela(){
        setSize(425, 525);
        setTitle("Tela inicial");
        ctn = getContentPane();
        lblNome = new JLabel("Nome");
        txtNome = new JTextField();
        lblEndereco = new JLabel("Endereço");
        txtEndereco = new JTextField();
        lblTelefone = new JLabel("Telefone");
        try {
            txtTelefone = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
        } catch (ParseException e){
            e.printStackTrace();
        }
        lblCPF = new JLabel("CPF");
        try {
            txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        } catch (ParseException e){
            e.printStackTrace();
        }
        lblSangue = new JLabel("Tipo Sanguineo");
        cmbSangue = new JComboBox(tiposSangue);
        lblFator = new JLabel("Fator RH");
        cmbFator = new JComboBox(tiposFator);
        lblCurso = new JLabel("Curso");
        cmbCurso = new JComboBox(tiposCurso);
        lblEmergencia = new JLabel("Contato de emergência");
        txtEmergencia = new JTextField();
        btnInserir = new JButton("Inserir");
        btnCancelar = new JButton("Cancelar");
        ctn.setLayout(null);
        lblNome.setBounds(10,0,100,25);
        txtNome.setBounds(150,0,250,25);
        lblEndereco.setBounds(10,50,100,25);
        txtEndereco.setBounds(150,50,250,25);
        lblTelefone.setBounds(10,100,100,25);
        txtTelefone.setBounds(150,100,250,25);
        lblCPF.setBounds(10,150,100,25);
        txtCPF.setBounds(150,150,250,25);
        lblSangue.setBounds(10,200,100,25);
        cmbSangue.setBounds(150,200,50,25);
        lblFator.setBounds(300,200,100,25);
        cmbFator.setBounds(350,200,50,25);
        lblCurso.setBounds(10,250,100,25);
        cmbCurso.setBounds(150,250,250,25);
        lblEmergencia.setBounds(10,300,200,25);
        txtEmergencia.setBounds(150,300,250,25);
        btnInserir.setBounds(105,375,100,100);
        btnCancelar.setBounds(210,375,100,100);
        ctn.add(lblNome);
        ctn.add(txtNome);
        ctn.add(lblEndereco);
        ctn.add(txtEndereco);
        ctn.add(lblTelefone);
        ctn.add(txtTelefone);
        ctn.add(lblCPF);
        ctn.add(txtCPF);
        ctn.add(lblSangue);
        ctn.add(cmbSangue);
        ctn.add(lblFator);
        ctn.add(cmbFator);
        ctn.add(lblCurso);
        ctn.add(cmbCurso);
        ctn.add(lblEmergencia);
        ctn.add(txtEmergencia);
        ctn.add(btnInserir);
        ctn.add(btnCancelar);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        SegundaTela t2 = new SegundaTela();
    }
}
