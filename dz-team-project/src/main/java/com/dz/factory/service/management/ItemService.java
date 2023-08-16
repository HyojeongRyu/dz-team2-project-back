package com.dz.factory.service.management;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dz.factory.domain.management.Item;
import com.dz.factory.mapper.management.ItemMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ItemService {

	private final ItemMapper itemMapper;

	@Transactional
	public ArrayList<Item> getAllItem() {
		return itemMapper.selAllItem();
	}

	@Transactional
	public void itemAdd(Item item) {
		itemMapper.insertItem(item);
	}

	@Transactional
	public void delItem(List<Integer> ids) {
		for(int id : ids) {
			itemMapper.deleteItem(id);
		}
	}
	
}
