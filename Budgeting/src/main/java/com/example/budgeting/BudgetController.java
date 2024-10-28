package com.example.budgeting;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class BudgetController {
    @FXML
    private Label leftoverBudget;
    @FXML
    private TextField budgetInfo;
    @FXML
    private TextField budgetUsedInfo;

    @FXML
    private TextField costInput;
    @FXML
    private TextField purchaseInput;
    @FXML
    private Text textTop;
    @FXML
    private Text budgetUsedText;

    private double totalBudget = 0;
    private double totalBudgetUsed = 0;
    private String purchasedItem;

private double availableBudget = 0;
    @FXML
    protected void onEnterButtonClick() {
        totalBudget = Double.parseDouble(budgetInfo.getText());
        textTop.setText(String.valueOf(totalBudget));

    }

    @FXML
    protected void onEnterBudgetUsedButtonClick() {
        totalBudgetUsed = Double.parseDouble(budgetUsedInfo.getText());
        budgetUsedText.setText(String.valueOf(totalBudgetUsed));
        availableBudget = totalBudget - totalBudgetUsed;
        leftoverBudget.setText(String.valueOf(availableBudget));
    }

    @FXML
    protected void handleAddCostAndPurchase() {
    // totalBudget = Double.parseDouble(budgetInfo.getText());
    // totalBudgetUsed = Double.parseDouble(budgetUsedInfo.getText());
    // availableBudget = totalBudget - totalBudgetUsed;
    // leftoverBudget.setText(String.valueOf(availableBudget));

        purchasedItem = purchaseInput.getText().trim().toUpperCase();
    }

    private boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}