package bankapp;

import javax.swing.JOptionPane;

/**
*
* BankAppGUI class
*/
public class BankAppGUI extends javax.swing.JFrame {

    /**
     * Creates new form BankAppGUI
     */
    public BankAppGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                        
    private void initComponents() {

        bankAppPanel = new javax.swing.JPanel();
        customerFirstNameLabel = new javax.swing.JLabel();
        customerFirstNameField = new javax.swing.JTextField();
        searchCustomerButton = new javax.swing.JButton();
        customerLastNameLabel = new javax.swing.JLabel();
        customerLastNameField = new javax.swing.JTextField();
        previousCustomerButton = new javax.swing.JButton();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        nextCustomerButton = new javax.swing.JButton();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        addCustomerButton = new javax.swing.JButton();
        accountNumberLabel = new javax.swing.JLabel();
        accountNumberField = new javax.swing.JTextField();
        updateCustomerButton = new javax.swing.JButton();
        balanceLabel = new javax.swing.JLabel();
        balanceField = new javax.swing.JTextField();
        openAccountButton = new javax.swing.JButton();
        withdrawDepositLabel = new javax.swing.JLabel();
        withdrawDepositField = new javax.swing.JTextField();
        depositButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        interestMonthLabel = new javax.swing.JLabel();
        interestMonthField = new javax.swing.JTextField();
        calculatedInterestLabel = new javax.swing.JLabel();
        calculatedInterestField = new javax.swing.JTextField();
        calculateInterestButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerFirstNameLabel.setText("Customer First Name");

        customerFirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerFirstNameFieldActionPerformed(evt);
            }
        });

        searchCustomerButton.setText("Search Customer");
        searchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerButtonActionPerformed(evt);
            }
        });

        customerLastNameLabel.setText("Customer Last Name");

        previousCustomerButton.setText("Previous Customer");

        addressLabel.setText("Address");

        nextCustomerButton.setText("Next Customer");

        phoneNumberLabel.setText("Phone Number");

        addCustomerButton.setText("Add Customer");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        accountNumberLabel.setText("Account Number");

        updateCustomerButton.setText("Update Customer");

        balanceLabel.setText("Balance");

        balanceField.setEnabled(false);

        openAccountButton.setText("Open Account");

        withdrawDepositLabel.setText("Withdraw/Deposit");

        depositButton.setText("Deposit");

        withdrawButton.setText("Withdraw");

        interestMonthLabel.setText("Interest Month");

        calculatedInterestLabel.setText("Calculated Interest");

        calculateInterestButton.setText("Calculate Interest");

        javax.swing.GroupLayout bankAppPanelLayout = new javax.swing.GroupLayout(bankAppPanel);
        bankAppPanel.setLayout(bankAppPanelLayout);
        bankAppPanelLayout.setHorizontalGroup(
            bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bankAppPanelLayout.createSequentialGroup()
                .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bankAppPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bankAppPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bankAppPanelLayout.createSequentialGroup()
                                .addComponent(customerFirstNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(customerFirstNameField))
                            .addGroup(bankAppPanelLayout.createSequentialGroup()
                                .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerLastNameLabel)
                                    .addComponent(addressLabel)
                                    .addComponent(phoneNumberLabel)
                                    .addComponent(accountNumberLabel)
                                    .addComponent(balanceLabel)
                                    .addComponent(withdrawDepositLabel)
                                    .addComponent(interestMonthLabel))
                                .addGap(18, 18, 18)
                                .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerLastNameField)
                                    .addComponent(addressField)
                                    .addComponent(phoneNumberField)
                                    .addComponent(accountNumberField)
                                    .addComponent(balanceField)
                                    .addComponent(withdrawDepositField)
                                    .addGroup(bankAppPanelLayout.createSequentialGroup()
                                        .addComponent(interestMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(calculatedInterestLabel)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calculateInterestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bankAppPanelLayout.createSequentialGroup()
                                .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(searchCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(previousCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(nextCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(updateCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(openAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(depositButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(calculatedInterestField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        bankAppPanelLayout.setVerticalGroup(
            bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bankAppPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerFirstNameLabel)
                    .addComponent(customerFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCustomerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previousCustomerButton)
                    .addComponent(customerLastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextCustomerButton))
                .addGap(18, 18, 18)
                .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCustomerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNumberLabel)
                    .addComponent(accountNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateCustomerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balanceLabel)
                    .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(openAccountButton)))
                .addGap(18, 18, 18)
                .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawDepositLabel)
                    .addComponent(withdrawDepositField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositButton))
                .addGap(18, 18, 18)
                .addComponent(withdrawButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculateInterestButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(bankAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interestMonthLabel)
                    .addComponent(interestMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculatedInterestLabel)
                    .addComponent(calculatedInterestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bankAppPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bankAppPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                      

    private void customerFirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void searchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        String fname = customerFirstNameField.getText();
        String lname = customerLastNameField.getText();
        Customer customer=null;
        if(!fname.equals("")) //if first name is entered.
            customer = Customers.searchCustomerByFirstName(fname);
        else if(!lname.equals("")) //if last name is entered
            customer = Customers.searchCustomerByLastName(lname);
        else if(!fname.equals("") && !lname.equals(""))//if both are entered
            customer = Customers.searchCustomerByFirstName(fname);
        if(customer!=null)
        {
            accountNumberField.setText(customer.getSavingsAccount().getAccountNumber());
            balanceField.setText(Double.toString(customer.getSavingsAccount().getBalance()));
        }
    }                                                  

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        String accNumber = accountNumberField.getText();
        double bal = 0; //balance for new account is 0.
        double rate = 4; //savings interest rate
        SavingsAccount account = new SavingsAccount(accNumber,bal,rate);
        String fName = customerFirstNameField.getText();
        String lName = customerLastNameField.getText();
        String address = addressField.getText();
        String phone = phoneNumberField.getText();
        if(Customers.searchCustomerByFirstName(fName)!=null)
        {
            JOptionPane.showMessageDialog(this, "Error: Customer already has an account.");
        }
        else
        {
            Customers.addCustomer(new Customer(Customers.getTotalCustomers()+1, fName, lName, address, phone, account));
            JOptionPane.showMessageDialog(this, "Customer added.");
            customerFirstNameField.setText("");
            customerLastNameField.setText("");
            addressField.setText("");
            phoneNumberField.setText("");
            accountNumberField.setText("");
        }
    }                                               

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankAppGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                   
    private javax.swing.JTextField accountNumberField;
    private javax.swing.JLabel accountNumberLabel;
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField balanceField;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JPanel bankAppPanel;
    private javax.swing.JButton calculateInterestButton;
    private javax.swing.JTextField calculatedInterestField;
    private javax.swing.JLabel calculatedInterestLabel;
    private javax.swing.JTextField customerFirstNameField;
    private javax.swing.JLabel customerFirstNameLabel;
    private javax.swing.JTextField customerLastNameField;
    private javax.swing.JLabel customerLastNameLabel;
    private javax.swing.JButton depositButton;
    private javax.swing.JTextField interestMonthField;
    private javax.swing.JLabel interestMonthLabel;
    private javax.swing.JButton nextCustomerButton;
    private javax.swing.JButton openAccountButton;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JButton previousCustomerButton;
    private javax.swing.JButton searchCustomerButton;
    private javax.swing.JButton updateCustomerButton;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JTextField withdrawDepositField;
    private javax.swing.JLabel withdrawDepositLabel;
    // End of variables declaration                 
}