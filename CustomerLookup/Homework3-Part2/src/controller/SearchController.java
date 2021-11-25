package controller;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import model.Customer;
import model.Model;

public class SearchController {

	private Model model;

	@FXML
	private TextField phoneTextField;

	@FXML
	private ImageView imageView;

	@FXML
	private Label fNameLabel;

	@FXML
	private Label lNameLabel;

	@FXML
	private Label billAmountLabel;

	@FXML
	private TextArea notesTextArea;

	@FXML
	private Label statusLabel;

	@FXML
	public void initialize()
	{
		System.out.println("Reading Customers DB...");
		model = new Model();
	}

	/**
	 * This method must find out whether the customer number inside the phoneTextField is a valid customer number, then it will search the database for
	 * the customer record. If customer number is found then it will change the following to show the customer's data:
	 * 			1- change status label color and text to become blue and say "Customer Found"
	 * 			2- first name label
	 * 			3- last name label
	 * 			4- image view
	 * 			5- bill amount
	 * 			6- notes text area
	 * 
	 * If the customer is not found, then the status label color will be red and will show "No customer found!"
	 * 
	 * If the input text is not a phone number, then the status label color will become red and will show "Not a phone number!"
	 * 
	 * @param event
	 */
	@FXML
	void searchButton(ActionEvent event) {
		int inPhone = 0;

		model = new Model();

		try {
			inPhone = Integer.parseInt(phoneTextField.getText());
			ArrayList<Customer> c = new ArrayList<Customer>();
			c.addAll(model.getCustomerDB());



			for(int i=0;i<c.size();i++) {

				if(inPhone != c.get(i).getPhoneNumber()) {
					statusLabel.setTextFill(Color.RED);
					statusLabel.setText("Customer not found!");
					continue;

				}

				if(inPhone == c.get(i).getPhoneNumber() ) {
					statusLabel.setTextFill(Color.BLUE);
					statusLabel.setText("Customer found");

					fNameLabel.setText("First Name: " + c.get(i).getfName());
					lNameLabel.setText("Last Name : " + c.get(i).getlName());
					billAmountLabel.setText("Bill Amount: " + c.get(i).getBillAmount());
					notesTextArea.setText(c.get(i).getNotes());
					imageView.setImage(model.loadImage(c.get(i).getPictureFile()));
					return;
				}
			}
			return;

		}
		catch(NumberFormatException NFE){

			statusLabel.setTextFill(Color.RED);
			statusLabel.setText("Not a phone number!");

		}



	}
	/*
	 * Notes: 
	 * 	- You can access the customer database using the "model" instance variable
	 *  - To convert a number from string to integer, use the static method Integer.parseInt(...). You will need to "catch" the NumberFormatException incase the input is not a number
	 *  - To change the color of a label, use the method setTextFill(..) .  For example, myLabel.setTextFill(Color.RED) will set the label to red color
	 *  - To set the image of the imageView just call imageView.setImage( Image img ). 
	 *  - To generate the "Image" object, use the model.loadImage( String imageFileName)
	 *       For example: model.loadImage( foundCustomer.getPictureFile() ) 
	 */


}
