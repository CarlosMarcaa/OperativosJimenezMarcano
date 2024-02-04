package Interface;

import Objects.SimulationData;
import javax.swing.JLabel;
import javax.swing.JTextField;
import operativosjimenezmarcano.Main;
import static operativosjimenezmarcano.Main.csvManager;
import static operativosjimenezmarcano.Main.CartoonNetwork;
import static operativosjimenezmarcano.Main.StarChannel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Miguel
 */
public class Views extends javax.swing.JFrame {

    /**
     * Creates new form views
     */
    public Views() {
        initComponents();
        this.setVisible(true);

        enterConfigData();

        StarChannel();
        CartoonNetwork();
    }

    // loads initial configuration data brought from a csv document
    private void enterConfigData() {
        simulationDuration.setText((String) Main.simulationData.getSimulationDuration());
        deadline.setText((String) Main.simulationData.getDeadline());
        screenwriters.setText((String) Main.simulationData.getScreenwriters());
        stageDesigner.setText((String) Main.simulationData.getStageDesigner());
        animator.setText((String) Main.simulationData.getAnimator());
        voiceActors.setText((String) Main.simulationData.getVoiceActors());
        plotTwistScriptwriters.setText((String) Main.simulationData.getPlotTwistScriptwriters());
        assemblers.setText((String) Main.simulationData.getAssemblers());
    }

    // sets the dynamic values of the interface for the Star Channel
    private void StarChannel() {
        // Finance
        revenue.setText(String.valueOf(StarChannel.getProfits()));
        costs.setText(String.valueOf(StarChannel.getSalaryAccount()));
        netIncome.setText(String.valueOf(StarChannel.getProfits() - StarChannel.getSalaryAccount()));
        // Drive Management
        scriptAvailability.setText(String.valueOf(StarChannel.getScriptwriterDrive().getMaxResourse()
                - StarChannel.getScriptwriterDrive().getResourse()));
        stageAvailability.setText(String.valueOf(
                StarChannel.getSetDesignerDrive().getMaxResourse() - StarChannel.getSetDesignerDrive().getResourse()));
        animationAvailability.setText(String.valueOf(
                StarChannel.getAnimatorDrive().getMaxResourse() - StarChannel.getAnimatorDrive().getResourse()));
        dubbingAvailability.setText(String.valueOf(
                StarChannel.getVoiceActorDrive().getMaxResourse() - StarChannel.getVoiceActorDrive().getResourse()));
        plotTwistAvailability.setText(String.valueOf(
                StarChannel.getPlotTwisterDrive().getMaxResourse() - StarChannel.getPlotTwisterDrive().getResourse()));
        // chapter control
        readyStandardStar.setText(String.valueOf(StarChannel.getAssemblerDrive().getResourse()));
        readyPlotTwistStar.setText(String.valueOf(StarChannel.getPlotAssemblerDrive().getResourse()));
        deadlineCounterStar.setText(String.valueOf(StarChannel.getDeadlineRatio()));
        // employee management
        projectManagerStatusStar.setText(StarChannel.getProyectManager().isWatchingAnime() ? "Anime" : "Trabajando");
        projectManagerFaultsStar.setText(String.valueOf(StarChannel.getPmFaults()));
        projectManagerDeductionStar.setText(String.valueOf(StarChannel.getPmDiscountedAmount()));
        directorStatusStar.setText(String.valueOf(StarChannel.getDirector().isCheckingPM()));
    }

    // sets the dynamic values of the interface for Cartoon Network
    private void CartoonNetwork() {
        // Finance
        revenueC.setText(String.valueOf(CartoonNetwork.getProfits()));
        costsC.setText(String.valueOf(CartoonNetwork.getSalaryAccount()));
        netIncomeC.setText(String.valueOf(CartoonNetwork.getProfits() - CartoonNetwork.getSalaryAccount()));
        // Drive Management
        scriptAvailabilityC.setText(String.valueOf(CartoonNetwork.getScriptwriterDrive().getMaxResourse()
                - CartoonNetwork.getScriptwriterDrive().getResourse()));
        stageAvailabilityC.setText(String.valueOf(CartoonNetwork.getSetDesignerDrive().getMaxResourse()
                - CartoonNetwork.getSetDesignerDrive().getResourse()));
        animationAvailabilityC.setText(String.valueOf(
                CartoonNetwork.getAnimatorDrive().getMaxResourse() - CartoonNetwork.getAnimatorDrive().getResourse()));
        dubbingAvailabilityC.setText(String.valueOf(CartoonNetwork.getVoiceActorDrive().getMaxResourse()
                - CartoonNetwork.getVoiceActorDrive().getResourse()));
        plotTwistAvailabilityC.setText(String.valueOf(CartoonNetwork.getPlotTwisterDrive().getMaxResourse()
                - CartoonNetwork.getPlotTwisterDrive().getResourse()));
        // chapter control
        readyStandard.setText(String.valueOf(CartoonNetwork.getAssemblerDrive().getResourse()));
        readyPlotTwist.setText(String.valueOf(CartoonNetwork.getPlotAssemblerDrive().getResourse()));
        deadlineCounter.setText(String.valueOf(CartoonNetwork.getDeadlineRatio()));
        // employee management
        projectManagerStatus.setText(CartoonNetwork.getProyectManager().isWatchingAnime() ? "Anime" : "Trabajando");
        projectManagerFaults.setText(String.valueOf(CartoonNetwork.getPmFaults()));
        projectManagerDeduction.setText(String.valueOf(CartoonNetwork.getPmDiscountedAmount()));
        directorStatus.setText("Administrando");
    }

    private Integer sum() {
        Integer sum = Integer.valueOf(animator.getText()) + Integer.valueOf(assemblers.getText())
                + Integer.parseInt(plotTwistScriptwriters.getText())
                + Integer.parseInt(screenwriters.getText()) + Integer.parseInt(stageDesigner.getText())
                + Integer.parseInt(voiceActors.getText());
        return sum;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cartoonLogo = new javax.swing.JLabel();
        scriptLabel = new javax.swing.JLabel();
        stageLabel = new javax.swing.JLabel();
        animationLabel = new javax.swing.JLabel();
        dubbingLabel = new javax.swing.JLabel();
        driveTitle = new javax.swing.JLabel();
        plotTwistDriveLabel = new javax.swing.JLabel();
        revenueLabel = new javax.swing.JLabel();
        costsLabel = new javax.swing.JLabel();
        netIncomeLabel = new javax.swing.JLabel();
        revenueC = new javax.swing.JLabel();
        costsC = new javax.swing.JLabel();
        netIncomeC = new javax.swing.JLabel();
        scriptAvailabilityC = new javax.swing.JLabel();
        stageAvailabilityC = new javax.swing.JLabel();
        animationAvailabilityC = new javax.swing.JLabel();
        dubbingAvailabilityC = new javax.swing.JLabel();
        plotTwistAvailabilityC = new javax.swing.JLabel();
        chaptersLabel = new javax.swing.JLabel();
        standardChapterLabel = new javax.swing.JLabel();
        plotTwistChapterLabel = new javax.swing.JLabel();
        readyStandard = new javax.swing.JLabel();
        readyPlotTwist = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        projectManagerStatus = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        directorStatus = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        projectManagerFaults = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        projectManagerDeduction = new javax.swing.JLabel();
        deadlineLabel = new javax.swing.JLabel();
        deadlineCounter = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        revenue = new javax.swing.JLabel();
        costs = new javax.swing.JLabel();
        netIncome = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        scriptAvailability = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        stageAvailability = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        animationAvailability = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        dubbingAvailability = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        plotTwistAvailability = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        readyStandardStar = new javax.swing.JLabel();
        readyPlotTwistStar = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        projectManagerStatusStar = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        directorStatusStar = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        projectManagerFaultsStar = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        projectManagerDeductionStar = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        deadlineCounterStar = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        simulationDuration = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        deadline = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        screenwriters = new javax.swing.JTextField();
        stageDesigner = new javax.swing.JTextField();
        animator = new javax.swing.JTextField();
        voiceActors = new javax.swing.JTextField();
        plotTwistScriptwriters = new javax.swing.JTextField();
        assemblers = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        validator = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 191, 185));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartoonLogo
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CARTOON_NETWORK_logopequeno.png"))); // NOI18N
        jPanel1.add(cartoonLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        cartoonLogo.getAccessibleContext().setAccessibleName("cartoonLogo");

        scriptLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        scriptLabel.setForeground(new java.awt.Color(255, 255, 255));
        scriptLabel.setText("Guiones:");
        jPanel1.add(scriptLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        stageLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stageLabel.setForeground(new java.awt.Color(255, 255, 255));
        stageLabel.setText("Escenarios:");
        jPanel1.add(stageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, -1, -1));

        animationLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        animationLabel.setForeground(new java.awt.Color(255, 255, 255));
        animationLabel.setText("Animaciones:");
        jPanel1.add(animationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));

        dubbingLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dubbingLabel.setForeground(new java.awt.Color(255, 255, 255));
        dubbingLabel.setText("Doblajes:");
        jPanel1.add(dubbingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, -1, -1));

        driveTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        driveTitle.setForeground(new java.awt.Color(255, 255, 255));
        driveTitle.setText("Disponibilidad Drive");
        jPanel1.add(driveTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        plotTwistDriveLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        plotTwistDriveLabel.setForeground(new java.awt.Color(255, 255, 255));
        plotTwistDriveLabel.setText("PlotTwist:");
        jPanel1.add(plotTwistDriveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, -1, -1));

        revenueLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        revenueLabel.setForeground(new java.awt.Color(255, 255, 255));
        revenueLabel.setText("Ganancias en bruto:");
        jPanel1.add(revenueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        costsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        costsLabel.setForeground(new java.awt.Color(255, 255, 255));
        costsLabel.setText("Costos operativos:");
        jPanel1.add(costsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        netIncomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        netIncomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        netIncomeLabel.setText("Utilidades:");
        jPanel1.add(netIncomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 98, -1, -1));

        revenueC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        revenueC.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(revenueC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        costsC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        costsC.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(costsC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        netIncomeC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        netIncomeC.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(netIncomeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        scriptAvailabilityC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        scriptAvailabilityC.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(scriptAvailabilityC, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        stageAvailabilityC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stageAvailabilityC.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(stageAvailabilityC, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, -1));

        animationAvailabilityC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        animationAvailabilityC.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(animationAvailabilityC, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, -1));

        dubbingAvailabilityC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dubbingAvailabilityC.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dubbingAvailabilityC, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, -1, -1));

        plotTwistAvailabilityC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        plotTwistAvailabilityC.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(plotTwistAvailabilityC, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, -1, -1));

        chaptersLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        chaptersLabel.setForeground(new java.awt.Color(255, 255, 255));
        chaptersLabel.setText("Episodios Listos");
        jPanel1.add(chaptersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        standardChapterLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        standardChapterLabel.setForeground(new java.awt.Color(255, 255, 255));
        standardChapterLabel.setText("Estándar:");
        jPanel1.add(standardChapterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        plotTwistChapterLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        plotTwistChapterLabel.setForeground(new java.awt.Color(255, 255, 255));
        plotTwistChapterLabel.setText("PlotTwist:");
        jPanel1.add(plotTwistChapterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        readyStandard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        readyStandard.setForeground(new java.awt.Color(255, 255, 255));
        readyStandard.setText("0");
        readyStandard.setToolTipText("");
        jPanel1.add(readyStandard, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        readyPlotTwist.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        readyPlotTwist.setForeground(new java.awt.Color(255, 255, 255));
        readyPlotTwist.setText("0");
        jPanel1.add(readyPlotTwist, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Estado de actividad:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Project Manager:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        projectManagerStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectManagerStatus.setForeground(new java.awt.Color(255, 255, 255));
        projectManagerStatus.setText("Trabajando");
        jPanel1.add(projectManagerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Director:");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        directorStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        directorStatus.setForeground(new java.awt.Color(255, 255, 255));
        directorStatus.setText("Trabajando");
        jPanel1.add(directorStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("#Faltas:");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        projectManagerFaults.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectManagerFaults.setForeground(new java.awt.Color(255, 255, 255));
        projectManagerFaults.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectManagerFaults.setText("0");
        projectManagerFaults.setToolTipText("");
        jPanel1.add(projectManagerFaults, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 90, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Dinero descontado:");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        projectManagerDeduction.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectManagerDeduction.setForeground(new java.awt.Color(255, 255, 255));
        projectManagerDeduction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectManagerDeduction.setText("0");
        jPanel1.add(projectManagerDeduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 210, -1));

        deadlineLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deadlineLabel.setForeground(new java.awt.Color(255, 255, 255));
        deadlineLabel.setText("Días restantes para la entrega:");
        jPanel1.add(deadlineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        deadlineCounter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deadlineCounter.setForeground(new java.awt.Color(255, 255, 255));
        deadlineCounter.setText("0");
        jPanel1.add(deadlineCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Datos Financieros");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cartoonCharacters.png"))); // NOI18N
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grandpa.png"))); // NOI18N
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, -1, -1));

        jTabbedPane1.addTab("Cartoon Network", jPanel1);

        jPanel2.setBackground(new java.awt.Color(28, 32, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starChannelLogopequeno.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleName("starLogo");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ganancias en bruto:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 36, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Costos operativos:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 67, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Utilidades:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 98, -1, -1));

        revenue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        revenue.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(revenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 36, -1, -1));

        costs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        costs.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(costs, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 67, -1, -1));

        netIncome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        netIncome.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(netIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 98, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Guiones:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 36, -1, -1));

        scriptAvailability.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        scriptAvailability.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(scriptAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 36, 43, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Escenarios:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, -1, -1));

        stageAvailability.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stageAvailability.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(stageAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Animaciones:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));

        animationAvailability.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        animationAvailability.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(animationAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Doblajes:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Disponibilidad Drive");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        dubbingAvailability.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dubbingAvailability.setForeground(new java.awt.Color(255, 255, 255));
        dubbingAvailability.setToolTipText("");
        jPanel2.add(dubbingAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("PlotTwist:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, -1, -1));

        plotTwistAvailability.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        plotTwistAvailability.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(plotTwistAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Episodios Listos");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Estándar:");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("PlotTwist:");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        readyStandardStar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        readyStandardStar.setForeground(new java.awt.Color(255, 255, 255));
        readyStandardStar.setText("0");
        readyStandardStar.setToolTipText("");
        jPanel2.add(readyStandardStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        readyPlotTwistStar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        readyPlotTwistStar.setForeground(new java.awt.Color(255, 255, 255));
        readyPlotTwistStar.setText("0");
        jPanel2.add(readyPlotTwistStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Estado de actividad:");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Project Manager:");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        projectManagerStatusStar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectManagerStatusStar.setForeground(new java.awt.Color(255, 255, 255));
        projectManagerStatusStar.setText("Trabajando");
        jPanel2.add(projectManagerStatusStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Director:");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        directorStatusStar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        directorStatusStar.setForeground(new java.awt.Color(255, 255, 255));
        directorStatusStar.setText("Trabajando");
        jPanel2.add(directorStatusStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("#Faltas:");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        projectManagerFaultsStar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectManagerFaultsStar.setForeground(new java.awt.Color(255, 255, 255));
        projectManagerFaultsStar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectManagerFaultsStar.setText("0");
        jPanel2.add(projectManagerFaultsStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 70, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Dinero descontado:");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        projectManagerDeductionStar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectManagerDeductionStar.setForeground(new java.awt.Color(255, 255, 255));
        projectManagerDeductionStar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectManagerDeductionStar.setText("0");
        jPanel2.add(projectManagerDeductionStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 210, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Días restantes para la entrega:");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        deadlineCounterStar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deadlineCounterStar.setForeground(new java.awt.Color(255, 255, 255));
        deadlineCounterStar.setText("0");
        jPanel2.add(deadlineCounterStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Datos Financieros");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bobsburgers.png"))); // NOI18N
        jLabel54.setToolTipText("");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Simpsons_FamilyPicture.png"))); // NOI18N
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, -1, -1));

        jTabbedPane1.addTab("Star Channel", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Duración en segundos de un día en la simulación:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));
        jPanel3.add(simulationDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 71, -1));

        jLabel4.setText("Cantidad de días entre las entregas de los capítulos:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));
        jPanel3.add(deadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 71, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad inicial de trabajadores:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel6.setText("Guionistas:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jLabel7.setText("Diseñador de escenarios:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jLabel8.setText("Animador de personajes:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel9.setText("Actores de doblaje:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jLabel10.setText("Guionistas de PlotTwist:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jLabel11.setText("Ensambladores:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));
        jPanel3.add(screenwriters, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 71, -1));
        jPanel3.add(stageDesigner, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 71, -1));
        jPanel3.add(animator, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 71, -1));
        jPanel3.add(voiceActors, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 71, -1));
        jPanel3.add(plotTwistScriptwriters, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 71, -1));
        jPanel3.add(assemblers, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 71, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Simulación");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        saveButton.setText("Guardar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel3.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        validator.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(validator, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 435, -1, 32));

        jTabbedPane1.addTab("Configuración", jPanel3);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Haz click para ver la gráfica comparativa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Gráfica", jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveButtonActionPerformed
        if (animator.getText().trim().isEmpty() || assemblers.getText().trim().isEmpty()
                || deadline.getText().trim().isEmpty()
                || plotTwistScriptwriters.getText().trim().isEmpty() || screenwriters.getText().trim().isEmpty()
                || simulationDuration.getText().trim().isEmpty() || stageDesigner.getText().trim().isEmpty()
                || voiceActors.getText().trim().isEmpty()) {
            validator.setText("No pueden haber campos vacíos");
        } else if (numValidator(animator) == false
                || numValidator(assemblers) == false
                || numValidator(deadline) == false
                || numValidator(plotTwistScriptwriters) == false
                || numValidator(screenwriters) == false
                || numValidator(simulationDuration) == false
                || numValidator(stageDesigner) == false
                || numValidator(voiceActors) == false) {
            validator.setText("Todos los campos deben ser números enteros");
        } else {
            validator.setText("");
            if (sum() <= 18) {
                SimulationData newData = new SimulationData(animator.getText(), assemblers.getText(),
                        deadline.getText(),
                        plotTwistScriptwriters.getText(), screenwriters.getText(), simulationDuration.getText(),
                        stageDesigner.getText(), voiceActors.getText());
                csvManager.WriteText(newData);
            } else {
                validator.setText("La sumatoria de la cantidad de trabajadores debe ser menor o igual a 18");
            }

        }
    }// GEN-LAST:event_saveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        Chart chart = new Chart();
    }// GEN-LAST:event_jButton1ActionPerformed

    public static boolean numValidator(JTextField strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Integer i = Integer.valueOf(strNum.getText());
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Views.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Views.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Views.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Views.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Views().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel animationAvailability;
    private javax.swing.JLabel animationAvailabilityC;
    private javax.swing.JLabel animationLabel;
    private javax.swing.JTextField animator;
    private javax.swing.JTextField assemblers;
    private javax.swing.JLabel cartoonLogo;
    private javax.swing.JLabel chaptersLabel;
    private javax.swing.JLabel costs;
    private javax.swing.JLabel costsC;
    private javax.swing.JLabel costsLabel;
    private javax.swing.JTextField deadline;
    private javax.swing.JLabel deadlineCounter;
    private javax.swing.JLabel deadlineCounterStar;
    private javax.swing.JLabel deadlineLabel;
    private javax.swing.JLabel directorStatus;
    private javax.swing.JLabel directorStatusStar;
    private javax.swing.JLabel driveTitle;
    private javax.swing.JLabel dubbingAvailability;
    private javax.swing.JLabel dubbingAvailabilityC;
    private javax.swing.JLabel dubbingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel netIncome;
    private javax.swing.JLabel netIncomeC;
    private javax.swing.JLabel netIncomeLabel;
    private javax.swing.JLabel plotTwistAvailability;
    private javax.swing.JLabel plotTwistAvailabilityC;
    private javax.swing.JLabel plotTwistChapterLabel;
    private javax.swing.JLabel plotTwistDriveLabel;
    private javax.swing.JTextField plotTwistScriptwriters;
    private javax.swing.JLabel projectManagerDeduction;
    private javax.swing.JLabel projectManagerDeductionStar;
    private javax.swing.JLabel projectManagerFaults;
    private javax.swing.JLabel projectManagerFaultsStar;
    private javax.swing.JLabel projectManagerStatus;
    private javax.swing.JLabel projectManagerStatusStar;
    private javax.swing.JLabel readyPlotTwist;
    private javax.swing.JLabel readyPlotTwistStar;
    private javax.swing.JLabel readyStandard;
    private javax.swing.JLabel readyStandardStar;
    private javax.swing.JLabel revenue;
    private javax.swing.JLabel revenueC;
    private javax.swing.JLabel revenueLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField screenwriters;
    private javax.swing.JLabel scriptAvailability;
    private javax.swing.JLabel scriptAvailabilityC;
    private javax.swing.JLabel scriptLabel;
    private javax.swing.JTextField simulationDuration;
    private javax.swing.JLabel stageAvailability;
    private javax.swing.JLabel stageAvailabilityC;
    private javax.swing.JTextField stageDesigner;
    private javax.swing.JLabel stageLabel;
    private javax.swing.JLabel standardChapterLabel;
    private javax.swing.JLabel validator;
    private javax.swing.JTextField voiceActors;
    // End of variables declaration//GEN-END:variables

    public JLabel getAnimationAvailability() {
        return animationAvailability;
    }

    public void setAnimationAvailability(JLabel animationAvailability) {
        this.animationAvailability = animationAvailability;
    }

    public JLabel getAnimationAvailabilityC() {
        return animationAvailabilityC;
    }

    public void setAnimationAvailabilityC(JLabel animationAvailabilityC) {
        this.animationAvailabilityC = animationAvailabilityC;
    }

    public JTextField getAnimator() {
        return animator;
    }

    public void setAnimator(JTextField animator) {
        this.animator = animator;
    }

    public JTextField getAssemblers() {
        return assemblers;
    }

    public void setAssemblers(JTextField assemblers) {
        this.assemblers = assemblers;
    }

    public JLabel getCosts() {
        return costs;
    }

    public void setCosts(JLabel costs) {
        this.costs = costs;
    }

    public JLabel getCostsC() {
        return costsC;
    }

    public void setCostsC(JLabel costsC) {
        this.costsC = costsC;
    }

    public JTextField getDeadline() {
        return deadline;
    }

    public void setDeadline(JTextField deadline) {
        this.deadline = deadline;
    }

    public JLabel getDeadlineCounter() {
        return deadlineCounter;
    }

    public void setDeadlineCounter(JLabel deadlineCounter) {
        this.deadlineCounter = deadlineCounter;
    }

    public JLabel getDeadlineCounterStar() {
        return deadlineCounterStar;
    }

    public void setDeadlineCounterStar(JLabel deadlineCounterStar) {
        this.deadlineCounterStar = deadlineCounterStar;
    }

    public JLabel getDirectorStatus() {
        return directorStatus;
    }

    public void setDirectorStatus(JLabel directorStatus) {
        this.directorStatus = directorStatus;
    }

    public JLabel getDirectorStatusStar() {
        return directorStatusStar;
    }

    public void setDirectorStatusStar(JLabel directorStatusStar) {
        this.directorStatusStar = directorStatusStar;
    }

    public JLabel getDubbingAvailability() {
        return dubbingAvailability;
    }

    public void setDubbingAvailability(JLabel dubbingAvailability) {
        this.dubbingAvailability = dubbingAvailability;
    }

    public JLabel getDubbingAvailabilityC() {
        return dubbingAvailabilityC;
    }

    public void setDubbingAvailabilityC(JLabel dubbingAvailabilityC) {
        this.dubbingAvailabilityC = dubbingAvailabilityC;
    }

    public JLabel getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(JLabel netIncome) {
        this.netIncome = netIncome;
    }

    public JLabel getNetIncomeC() {
        return netIncomeC;
    }

    public void setNetIncomeC(JLabel netIncomeC) {
        this.netIncomeC = netIncomeC;
    }

    public JLabel getPlotTwistAvailability() {
        return plotTwistAvailability;
    }

    public void setPlotTwistAvailability(JLabel plotTwistAvailability) {
        this.plotTwistAvailability = plotTwistAvailability;
    }

    public JLabel getPlotTwistAvailabilityC() {
        return plotTwistAvailabilityC;
    }

    public void setPlotTwistAvailabilityC(JLabel plotTwistAvailabilityC) {
        this.plotTwistAvailabilityC = plotTwistAvailabilityC;
    }

    public JTextField getPlotTwistScriptwriters() {
        return plotTwistScriptwriters;
    }

    public void setPlotTwistScriptwriters(JTextField plotTwistScriptwriters) {
        this.plotTwistScriptwriters = plotTwistScriptwriters;
    }

    public JLabel getProjectManagerDeduction() {
        return projectManagerDeduction;
    }

    public void setProjectManagerDeduction(JLabel projectManagerDeduction) {
        this.projectManagerDeduction = projectManagerDeduction;
    }

    public JLabel getProjectManagerDeductionStar() {
        return projectManagerDeductionStar;
    }

    public void setProjectManagerDeductionStar(JLabel projectManagerDeductionStar) {
        this.projectManagerDeductionStar = projectManagerDeductionStar;
    }

    public JLabel getProjectManagerFaults() {
        return projectManagerFaults;
    }

    public void setProjectManagerFaults(JLabel projectManagerFaults) {
        this.projectManagerFaults = projectManagerFaults;
    }

    public JLabel getProjectManagerFaultsStar() {
        return projectManagerFaultsStar;
    }

    public void setProjectManagerFaultsStar(JLabel projectManagerFaultsStar) {
        this.projectManagerFaultsStar = projectManagerFaultsStar;
    }

    public JLabel getProjectManagerStatus() {
        return projectManagerStatus;
    }

    public void setProjectManagerStatus(JLabel projectManagerStatus) {
        this.projectManagerStatus = projectManagerStatus;
    }

    public JLabel getProjectManagerStatusStar() {
        return projectManagerStatusStar;
    }

    public void setProjectManagerStatusStar(JLabel projectManagerStatusStar) {
        this.projectManagerStatusStar = projectManagerStatusStar;
    }

    public JLabel getReadyPlotTwist() {
        return readyPlotTwist;
    }

    public void setReadyPlotTwist(JLabel readyPlotTwist) {
        this.readyPlotTwist = readyPlotTwist;
    }

    public JLabel getReadyPlotTwistStar() {
        return readyPlotTwistStar;
    }

    public void setReadyPlotTwistStar(JLabel readyPlotTwistStar) {
        this.readyPlotTwistStar = readyPlotTwistStar;
    }

    public JLabel getReadyStandard() {
        return readyStandard;
    }

    public void setReadyStandard(JLabel readyStandard) {
        this.readyStandard = readyStandard;
    }

    public JLabel getReadyStandardStar() {
        return readyStandardStar;
    }

    public void setReadyStandardStar(JLabel readyStandardStar) {
        this.readyStandardStar = readyStandardStar;
    }

    public JLabel getRevenue() {
        return revenue;
    }

    public void setRevenue(JLabel revenue) {
        this.revenue = revenue;
    }

    public JLabel getRevenueC() {
        return revenueC;
    }

    public void setRevenueC(JLabel revenueC) {
        this.revenueC = revenueC;
    }

    public JTextField getScreenwriters() {
        return screenwriters;
    }

    public void setScreenwriters(JTextField screenwriters) {
        this.screenwriters = screenwriters;
    }

    public JLabel getScriptAvailability() {
        return scriptAvailability;
    }

    public void setScriptAvailability(JLabel scriptAvailability) {
        this.scriptAvailability = scriptAvailability;
    }

    public JLabel getScriptAvailabilityC() {
        return scriptAvailabilityC;
    }

    public void setScriptAvailabilityC(JLabel scriptAvailabilityC) {
        this.scriptAvailabilityC = scriptAvailabilityC;
    }

    public JTextField getSimulationDuration() {
        return simulationDuration;
    }

    public void setSimulationDuration(JTextField simulationDuration) {
        this.simulationDuration = simulationDuration;
    }

    public JLabel getStageAvailability() {
        return stageAvailability;
    }

    public void setStageAvailability(JLabel stageAvailability) {
        this.stageAvailability = stageAvailability;
    }

    public JLabel getStageAvailabilityC() {
        return stageAvailabilityC;
    }

    public void setStageAvailabilityC(JLabel stageAvailabilityC) {
        this.stageAvailabilityC = stageAvailabilityC;
    }

    public JTextField getStageDesigner() {
        return stageDesigner;
    }

    public void setStageDesigner(JTextField stageDesigner) {
        this.stageDesigner = stageDesigner;
    }

    public JTextField getVoiceActors() {
        return voiceActors;
    }

    public void setVoiceActors(JTextField voiceActors) {
        this.voiceActors = voiceActors;
    }

}
