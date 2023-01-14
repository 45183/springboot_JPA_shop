package com.hyun.shop.entity;

import com.hyun.shop.constant.ItemSellStatus;
import com.hyun.shop.dto.ItemFormDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
public class Item extends BaseEntity {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;                            // 상품 코드

    @Column(nullable = false, length = 50)
    private String itemName;                    // 상품명

    @Column(nullable = false, name = "price")
    private int price;                          // 상품 가격

    @Column(nullable = false)
    private int stockNumber;                    // 상품 재고 수량

    @Lob
    @Column(nullable = false)
    private String itemDetail;                  // 상품 상세 설명

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus;      // 상품 판매 상태

    private LocalDateTime regTime;              // 상품 등록 시간

    private LocalDateTime updateTime;           // 상품 수정 시간

    public void updateItem(ItemFormDto itemFormDto){
        this.itemName = itemFormDto.getItemName();
        this.price = itemFormDto.getPrice();
        this.stockNumber = itemFormDto.getStockNumber();
        this.itemDetail = itemFormDto.getItemDetail();
        this.itemSellStatus = itemFormDto.getItemSellStatus();
    }
}
