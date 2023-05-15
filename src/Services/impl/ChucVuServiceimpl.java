/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.ChucVu;
import Repository.ChucVuRepository;
import Services.ChucVuService;
import ViewModels.QLChucVu;
import java.util.ArrayList;

/**
 *
 * @author Lê Chấn Khang
 */
public class ChucVuServiceimpl implements ChucVuService{
     private ChucVuRepository repository = new ChucVuRepository();
    
    @Override
    public ArrayList<QLChucVu> getAll() {
       return repository.getList();
    }
    
}
