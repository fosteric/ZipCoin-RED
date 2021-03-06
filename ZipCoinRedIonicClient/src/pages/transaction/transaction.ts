import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { TransactionService } from '../../providers/transaction-service';

/**
 * Generated class for the TransactionPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-transaction',
  templateUrl: 'transaction.html',
})
export class TransactionPage {
  private transactions : Array<any>;

  constructor(public navCtrl: NavController, public navParams: NavParams,
  public transactionService: TransactionService){
    this.getAllTransactions();
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad TransactionPage');
  }

  getAllTransactions() {
    this.transactionService.getAllTransactions().subscribe(transactions => {
      this.transactions = transactions;
    })
  }

}
