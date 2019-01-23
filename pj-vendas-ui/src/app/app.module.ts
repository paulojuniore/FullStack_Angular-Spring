import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { TableModule } from 'primeng/table';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { VendasListagemComponent } from './vendas-listagem/vendas-listagem.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    VendasListagemComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    TableModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
