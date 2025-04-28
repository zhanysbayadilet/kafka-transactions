package by.javaguru.estore.transfers.service;

import by.javaguru.estore.transfers.model.TransferRestModel;

public interface TransferService {
    boolean transfer(TransferRestModel productPaymentRestModel);
}
