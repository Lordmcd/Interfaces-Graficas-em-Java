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
        setSize(400, 800);
        setTitle("Tela inicial");
        ctn = getContentPane();
        lblNome = new JLabel("Nome");
        txtNome = new JTextField();
        lblEndereco = new JLabel("Endereço");
        txtEndereco = new JTextField();
        lblTelefone = new JLabel("CPF");
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
        btnInserir = new JButton("Inserir");
        btnCancelar = new JButton("Cancelar");
        ctn.setLayout(null);

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
