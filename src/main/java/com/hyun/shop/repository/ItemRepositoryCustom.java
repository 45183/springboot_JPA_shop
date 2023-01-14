package com.hyun.shop.repository;

import com.hyun.shop.dto.ItemSearchDto;
import com.hyun.shop.dto.MainItemDto;
import com.hyun.shop.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
}
