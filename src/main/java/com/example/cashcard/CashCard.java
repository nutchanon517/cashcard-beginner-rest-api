/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.cashcard;

import org.springframework.data.annotation.Id;

/**
 *
 * @author Oak
 */
record CashCard(@Id Long id, Double amount, String owner) {

}
