package com.dz.factory.service.management;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dz.factory.domain.management.Partner;
import com.dz.factory.mapper.management.PartnerMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PartnerService {

	private final PartnerMapper partnerMapper;

	@Transactional
	public void insert(Partner partner) {
		partnerMapper.insertPartner(partner);
	}

	@Transactional
	public ArrayList<Partner> selAllPartner() {
		return partnerMapper.seletAllPartner();
	}

	@Transactional
	public void delete(List<Integer> ids) {
		for(int id : ids) {
			partnerMapper.deletePartner(id);
		}
	}
	
	
}
