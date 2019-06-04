import { TestBed } from '@angular/core/testing';

import { SigningserviceService } from './signingservice.service';

describe('SigningserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SigningserviceService = TestBed.get(SigningserviceService);
    expect(service).toBeTruthy();
  });
});
