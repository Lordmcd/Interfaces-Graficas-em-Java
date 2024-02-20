package view;

import javax.swing.*;
import java.awt.Container;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
public class TerceiraTela extends JFrame{
    private JLabel lblRazaoS;
    private JTextField txtRazaoS;
    private JLabel lblRua;
    private JTextField txtRua;
    private JLabel lblBairro;
    private JTextField txtBairro;
    private JLabel lblCidade;
    private JTextField txtCidade;
    private JLabel lblUF;
    private JComboBox cmbUF;
    private final String[] TiposUF = {"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"};
    private JLabel lblCEP;
    private JFormattedTextField txtCEP;
    private JLabel lblCNPJ;
    private JFormattedTextField txtCNPJ;
    private JLabel lblCodigo;
    private JFormattedTextField txtCodigo;
    private JLabel lblNome;
    private JTextField txtNome;
    private JLabel lblContato;
    private JFormattedTextField txtContato;
    private JLabel lblFuncao;
    private JTextField txtFuncao;
    private JButton btnInserir;
    private JButton btnCancelar;
    private Container ctn;

    public TerceiraTela(){
        setSize(400,650);
        setTitle("Tela Inicial");
        ctn = getContentPane();
        lblRazaoS = new JLabel("Razão social");
        txtRazaoS = new JTextField();
        lblRua = new JLabel("Rua");
        txtRua = new JTextField();
        lblBairro = new JLabel("Bairro");
        txtBairro = new JTextField();
        lblCidade = new JLabel("Cidade");
        txtCidade = new JTextField();
        lblUF = new JLabel("UF");
        cmbUF = new JComboBox(TiposUF);
        lblCEP = new JLabel("CEP");
        try {
            txtCEP = new JFormattedTextField(new MaskFormatter("#####-###"));
        } catch (ParseException e){
            e.printStackTrace();
        }
        lblCNPJ = new JLabel("CNPJ");
        try {
            txtCNPJ = new JFormattedTextField(new MaskFormatter("##.###.###/####-##"));
        } catch (ParseException e){
            e.printStackTrace();
        }
        lblCodigo = new JLabel("Cod. do Fornecedor");
        try {
            txtCodigo = new JFormattedTextField(new MaskFormatter("UU-#####L"));
        } catch (ParseException e){
            e.printStackTrace();
        }
        lblNome = new JLabel("Nome do Contato");
        txtNome = new JTextField();
        lblContato = new JLabel("Telefone do Contato");
        try {
            txtContato = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
        } catch (ParseException e){
            e.printStackTrace();
        }
        lblFuncao = new JLabel("Função do contato");
        txtFuncao = new JTextField();
        btnInserir = new JButton("Inserir");
        btnCancelar = new JButton("Cancelar");
        ctn.setLayout(null);
        lblRazaoS.setBounds(10,10,100,25);
        txtRazaoS.setBounds(150,10,200,25);
        lblRua.setBounds(10,50,200,25);
        txtRua.setBounds(150,50,200,25);
        lblBairro.setBounds(10,100,200,25);
        txtBairro.setBounds(150,100,200,25);
        lblCidade.setBounds(10,150,100,25);
        txtCidade.setBounds(150,150,100,25);
        lblUF.setBounds(280,150,100,25);
        cmbUF.setBounds(300,150,50,25);
        lblCEP.setBounds(10,200,100,25);
        txtCEP.setBounds(150,200,100,25);
        lblCNPJ.setBounds(10,250,100,25);
        txtCNPJ.setBounds(150,250,125,25);
        lblCodigo.setBounds(10,300,150,25);
        txtCodigo.setBounds(150,300,100,25);
        lblNome.setBounds(10,350,100,25);
        txtNome.setBounds(150,350,200,25);
        lblContato.setBounds(10,400,150,25);
        txtContato.setBounds(150,400,100,25);
        lblFuncao.setBounds(10,450,150,25);
        txtFuncao.setBounds(150,450,200,25);
        btnInserir.setBounds(95, 500,100,100);
        btnCancelar.setBounds(205,500,100,100);
        ctn.add(lblRazaoS);
        ctn.add(txtRazaoS);
        ctn.add(lblRua);
        ctn.add(txtRua);
        ctn.add(lblBairro);
        ctn.add(txtBairro);
        ctn.add(lblCidade);
        ctn.add(txtCidade);
        ctn.add(lblUF);
        ctn.add(cmbUF);
        ctn.add(lblCEP);
        ctn.add(txtCEP);
        ctn.add(lblCNPJ);
        ctn.add(txtCNPJ);
        ctn.add(lblCodigo);
        ctn.add(txtCodigo);
        ctn.add(lblNome);
        ctn.add(txtNome);
        ctn.add(lblContato);
        ctn.add(txtContato);
        ctn.add(lblFuncao);
        ctn.add(txtFuncao);
        ctn.add(btnInserir);
        ctn.add(btnCancelar);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        TerceiraTela t3 = new TerceiraTela();
    }
}
