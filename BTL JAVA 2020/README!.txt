
nap tien vao momo : 0961662723 de mua item

Class Player(2P):
	Monster monster[3];

	showInfo();


Class Monster(4 elemental: W,F,I,W)
	int HP = 400;
	int MP = 240;
	int armor = 0; 
	int basicAttack = 20dmg;
	String elemental;
	String status = alive;	

	getDamage();
	Attack(); -20hp, single target, no mana.
	recoverMP(); +20MP
	useSkill1(); 
	useSkill2();
	useSkill3();
	useSkill4(); 
	

interface Skill1 (cost 60MP)
	+ water : heal for all allies, can't miss (+20HP per ally)
	+ fire	: damages all enemies and burns them in 2 turns (burn -8% HP, deal 20dmg per enemy, 10% miss)
	+ ice : stun all enemies, deal 15dmg per enemy( 40%miss); (player use this skill have 1 more turn)
	+ wind	: creat a windwall, protect an ally from 80 dmg in 1 turn (+80armor);
interface Skill2 (costs 35MP)
	+ water : deal 60dmg to an enemy (10% miss)
	+ fire : deal 60dmg to an enemy (10% miss)
	+ ice : deal 60dmg to an enemy (10% miss) 
	+ wind : deal 60dmg to an enemy (10% miss)
interface ultimate (can use after hp < 150 and (deal 200dmg || creat 320armor || heal 330HP )) (cost 0 MP)
	+ water : heals 50HP for all allies, recovers 15MP per ally and deals 30dmg to all enemy
	+ fire : deal 300 dmg to an enemy and buff x1.5 damage for all allies in 2 turn
	+ ice :	stun all enemies in 2turns (25% miss), deal
	+ wind :
