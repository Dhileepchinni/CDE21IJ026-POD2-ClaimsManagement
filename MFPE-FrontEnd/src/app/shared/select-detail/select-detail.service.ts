import { Injectable } from '@angular/core';

interface HospitalDetail {
  id: string;
  name: string;
  location: string;
}

interface PoilcyDetail {
  id: string;
  name: string;
}

interface BenefitDetail {
  id: string;
  name: string;
}

@Injectable({
  providedIn: 'root',
})
export class SelectDetailService {
  public hospitalDetails: Array<HospitalDetail> = [
    { id: 'H1', name: 'Apollo Hospital', location: 'Mumbai' },
    { id: 'H2', name: 'VS Hospital', location: 'Chennai' },
    {
      id: 'H3',
      name: 'Medanta Hospital',
      location: 'Gurgaon',
    },
    {
      id: 'H4',
      name: 'Fortis Escorts Heart Institute',
      location: 'Banglore',
    },
    {
      id: 'H5',
      name: 'BLK Super Speciality Hospital',
      location: 'Delhi-New Delhi',
    },
    {
      id: 'H6',
      name: 'Wockhardt Hospital',
      location: 'Nashik',
    },
    {
      id: 'H7',
      name: 'Columbia Asia Hospital',
      location: 'Mysore',
    },
  ];

  public policyDetails: Array<PoilcyDetail> = [
    { id: 'P1001', name: 'Health Plus Classic' },
    { id: 'P1002', name: 'Health Plus Enhanced' },
    { id: 'P1003', name: 'Health Plus Premium' },
    { id: 'P1004', name: 'COVID-19 Special Premium' },
  ];

  public benefitDetails: Array<BenefitDetail> = [
    { id: 'B101', name: 'Coverage for COVID-19' },
    { id: 'B102', name: 'Coverage for hospitalization at home' },
    { id: 'B103', name: 'Ambulance charges upto 2000 covered' },
    { id: 'B104', name: 'Ambulance charges upto 3000 covered' },
    { id: 'B105', name: 'Ambulance charges upto 4000 covered' },
    {
      id: 'B106',
      name: 'Hospitalization charges for Premium Twin Sharing room covered',
    },
    { id: 'B107', name: 'Hospitalization charges for Deluxe room covered' },
    {
      id: 'B108',
      name: 'Hospitalization charges for Premium Deluxe room covered',
    },
    {
      id: 'B109',
      name: 'Post hospitalization expenses',
    },
  ];
}
